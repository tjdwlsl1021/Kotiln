package com.example.myapplication.mvvm.ui.home.quotes

import androidx.lifecycle.ViewModel
import com.example.myapplication.mvvm.data.repositories.QuotesRepository
import com.example.myapplication.mvvm.util.lazyDeferred

class QuotesViewModel(
    repository: QuotesRepository
) : ViewModel() {

    val quotes by lazyDeferred {
        repository.getQuotes()
    }
}
