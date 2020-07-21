package com.example.myapplication.mvvm

import android.app.Application
import com.example.myapplication.mvvm.data.db.AppDatabase
import com.example.myapplication.mvvm.data.network.MyApi
import com.example.myapplication.mvvm.data.network.NetworkConnetionInterceptor
import com.example.myapplication.mvvm.data.repositories.UserRepository
import com.example.myapplication.mvvm.ui.auth.AuthViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class MVVMApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {

        import(androidXModule(this@MVVMApplication))

        bind() from singleton { NetworkConnetionInterceptor(instance()) }
        bind() from singleton { MyApi(instance()) }
        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { UserRepository(instance(), instance()) }
        bind() from provider { AuthViewModelFactory(instance()) }

    }
}