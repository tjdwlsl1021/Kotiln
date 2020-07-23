package com.example.myapplication.mvvm.ui.auth

import androidx.lifecycle.ViewModel
import com.example.myapplication.mvvm.data.db.entities.User
import com.example.myapplication.mvvm.data.repositories.UserRepository

class AuthViewModel(
    private val repository: UserRepository
) : ViewModel() {

    fun getLoggedInUser() = repository.getUser()

    suspend fun userLogin(
        email: String,
        password: String
    ) = repository.userLogin(email, password)

    suspend fun saveLoggedInUser(user: User) = repository.saveUser(user)
}