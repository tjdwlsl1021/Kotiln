package com.example.myapplication

import android.view.View


// 어싱크 -> 코루틴 변경하기 예제보고 공부
// 고민고민

// AsyncTask
object : AsyncTask<Void, Void, List<MyAccountItem>>() {
    override fun onPreExecute() {
        showProgress(R.string.loading)
    }

    override fun doInBackground(vararg params: Void): List<MyAccountItem> {
        return getMyAccountItemList();
    }

    override fun onPostExecute(result: List<MyAccountItem>) {
        if (isFinishing) return

        hideProgress()
        updateUI(result)
    }
}.execute()

// Coroutine
GlobalScope.launch(coroutineContext) {
    showProgress(R.string.loading)

    val accountList = async(Dispatchers.Default) { getMyAccountItemList() }.await()

    if (isFinishing) return@launch
    hideProgress()
    refreshUI(accountList)
}


///===== onCancle을 처리해야하는 경우

// AsyncTask
private inner class DeleteContactsTask(private val mAccountItem: MyAccountItem) :
    AsyncTask<Void, Int, Void>() {
    override fun onPreExecute() {
        showProgress(R.string.deleting) {
            cancel(true)
        }
    }

    override fun onCancelled(result: Void?) {
        hideProgress()
        showToast(R.string.toast_msg_delete_canceled)
        refreshUI()
    }

    override fun onProgressUpdate(vararg values: Int?) {
        val deletedCount = values[0]!!
        increaseProgress(deletedCount)
    }

    override fun doInBackground(vararg params: Void): Void? {
        ContactsDBHelper.deleteAllContacts(mAccount) { deletedCount ->
            publishProgress(deletedCount)
        }

        ContactsDBHelper.deleteContacts(
            account = mAccountItem.account,
            deletedCallback = { deletedCount -> publishProgress(deletedCount) },
            tackCancelWatcher = { return isCancelled() }
        )
        return null
    }

    override fun onPostExecute(result: Void?) {
        if (isFinishing) return

        hideProgress()
        showToast(R.string.toast_msg_delete_success)
        refreshUI()
    }
}

// Coroutine
GlobalScope.launch(coroutineContext) {
    val job = launch(Dispatchers.Default) {
        ContactsDBHelper.deleteContacts(
            account = myAccount.account,
            progressListener = { deletedCount ->
                launch(coroutineContext) {}
                increaseProgress(deletedCount)
            }
    },
    taskCancelWatcher = {
        isActive == false )
        )
    }

    showProgress(R.string.deleting) {
        job.cancel()
    }

    job.join()

    if (isFinishing) return@launch
    hideProgress()

    if (job.isCancelled) {
        showToast(R.string.toast_msg_delete_canceled)
    } else {
        showToast(R.string.toast_msg_delete_success)
    }
    refreshUI()


    //===AsyncTask
    class SomethingAsync extends AsyncTask<Void, Integer, Integer> {
        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
        }
        @Override
        protected Integer doInBackground(Void... voids) {


        return value;
    }
        @Override
        protected void onProgressUpdate(Integer ... values) {
        progressbar.setProgress(values[0].intValue());
    }

        @Override
        protected void onPostExecute(Integer result) {

        }


    }


    // rx
    Disposable backgroundtask;

    void BackgroundTask (String URLs) {
//onPreExecute

        progressBar.setVisibility(View.VISIBLE);

        backgroundtask = Observable.fromCallable(() -> {
//doInBackground

        Document doc = Jsoup . connect (URLs).timeout(3000).get();
        Elements elements = doc . select ("title");
        title = elements.get(0).text();

        return false;
    })
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe((result) -> {

//onPostExecute

        replaceFragment(title);
        progressBar.setVisibility(View.GONE);

        backgroundtask.dispose();
    });
    }


    //  defer 방식
    //  Disposable disposable = Observable.defer(() -> { // 백그라운드 동작
    //  Map<String, Bitmap> bitmapListMap1 = ImageUtils.decodeFile(urlListMap);
    //  return Observable.just(bitmapListMap1);
    //  })

    // fromCallable방식
    val disposable: Disposable = Observable.fromCallable({ ImageUtils.decodeFile(urlListMap) })
        .subscribeOn(Schedulers.io()) // subscribeOn : Observable을 어느 스레드에서 동작할 것인지 정의
        .observeOn(AndroidSchedulers.mainThread()) // observeOn() : observer가 어느 스레드에서 동작할 건인지 정의
        .subscribe({ bitmapListMap ->  // 메인스레드 동작

        },
            { throwable -> LogHelper.d("HSJ", "error 값 : " + throwable.getMessage()) }
            ,
            {
                LogHelper.d("hsj", "완료") // 자동으로 disposable처리되는지 확인용 주석
            }
        )

    compositeDisposable.add(disposable)
}

