package com.example.myapplication.mvvm.data.repositories

import com.example.myapplication.mvvm.data.network.MyApi
import com.example.myapplication.mvvm.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }
}