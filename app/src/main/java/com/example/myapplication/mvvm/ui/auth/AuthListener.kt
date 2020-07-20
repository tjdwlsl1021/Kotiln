package com.example.myapplication.mvvm.ui.auth

import com.example.myapplication.mvvm.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}