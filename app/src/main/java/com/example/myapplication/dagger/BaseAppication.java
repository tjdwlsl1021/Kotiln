package com.example.myapplication.dagger;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class BaseAppication extends DaggerApplication {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
//        return DaggerAppComponent.builder().application(this).build(); // 너무 내용을 몰라서 모르겠다. 담기회에~
    }
}
