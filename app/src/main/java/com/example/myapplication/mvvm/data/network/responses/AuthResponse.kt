package com.example.myapplication.mvvm.data.network.responses

import com.example.myapplication.mvvm.data.db.entities.User

data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User?
)
