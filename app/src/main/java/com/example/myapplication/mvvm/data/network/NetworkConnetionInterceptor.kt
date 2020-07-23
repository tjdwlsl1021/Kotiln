package com.example.myapplication.mvvm.data.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import com.example.myapplication.mvvm.util.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnetionInterceptor(
    context: Context
) : Interceptor {

    private val applicationContext = context.applicationContext
    override fun intercept(chain: Interceptor.Chain): Response {

        if (!isInternetAcailable())
            throw NoInternetException("Make sure you have an active data connection")
        return chain.proceed(chain.request())
    }

    private fun isInternetAcailable(): Boolean {

        // Deprecated
//        val connectivityManager =
//            applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        connectivityManager.activeNetworkInfo.also {
//            return it != null && it.isConnected
//        }

        var result = false
        val connectivityManager =
            applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        connectivityManager?.let {
            it.getNetworkCapabilities(connectivityManager.activeNetwork)?.apply {
                result = when {
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    else -> false
                }
            }
        }
        return result
    }

}