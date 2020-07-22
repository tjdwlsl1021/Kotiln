package com.example.myapplication.mvvm.ui.home.profile

import androidx.lifecycle.ViewModel
import com.example.myapplication.mvvm.data.repositories.UserRepository

class ProfileViewModel(
    repository: UserRepository
) : ViewModel() {

    val user = repository.getUser()
}
