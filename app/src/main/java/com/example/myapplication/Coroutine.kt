package com.example.myapplication


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