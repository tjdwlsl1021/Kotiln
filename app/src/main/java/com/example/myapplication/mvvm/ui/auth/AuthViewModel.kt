package com.example.myapplication.mvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.myapplication.mvvm.data.repositories.UserRepository

class AuthViewModel : ViewModel() {
    var email: String? = null //  xml에서 viewModel. 붙인거랑 연결
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }

        val loginResponse = UserRepository().userLogin(email!!, password!!)
        authListener?.onSuccess(loginResponse)
    }
}