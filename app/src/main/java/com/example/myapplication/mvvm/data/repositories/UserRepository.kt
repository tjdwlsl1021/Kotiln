package com.example.myapplication.mvvm.data.repositories

import com.example.myapplication.mvvm.data.network.MyApi
import com.example.myapplication.mvvm.data.network.SafeApiRequest
import com.example.myapplication.mvvm.data.network.responses.AuthResponse

class UserRepository : SafeApiRequest() {
    suspend fun userLogin(email: String, password: String): AuthResponse {
        return apiRequest { MyApi().userLogin(email, password) }
    }
}