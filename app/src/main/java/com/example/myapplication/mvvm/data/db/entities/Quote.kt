package com.example.myapplication.mvvm.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Quote(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val quote: String,
    val author: String,
    val thumbnail: String
    // 예제 동영상과는 달리 아래 값들이 null -> 에러-> 주석처리
//    val thumbnail: String,
//    val created_at: String,
//    val updated_at: String

)