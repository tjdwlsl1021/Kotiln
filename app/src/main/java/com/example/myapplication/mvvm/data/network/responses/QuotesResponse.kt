package com.example.myapplication.mvvm.data.network.responses

import com.example.myapplication.mvvm.data.db.entities.Quote

data class QuotesResponse(
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)