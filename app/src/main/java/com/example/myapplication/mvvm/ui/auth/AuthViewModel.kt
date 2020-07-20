package com.example.myapplication.mvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.myapplication.mvvm.data.repositories.UserRepository
import com.example.myapplication.mvvm.util.Coroutines

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

        Coroutines.main {
            val response = UserRepository().userLogin(email!!, password!!)
            if (response.isSuccessful) {
                authListener?.onSuccess(response.body()?.user!!)
            } else {
                authListener?.onFailure("Error Code : ${response.code()}")
            }
        }
    }
}