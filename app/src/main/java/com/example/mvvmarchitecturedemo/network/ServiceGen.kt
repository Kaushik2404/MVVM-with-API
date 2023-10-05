package com.example.mvvmarchitecturedemo.network

import com.example.mvvmarchitecturedemo.data.remote.DetailApi
import com.example.mvvmarchitecturedemo.data.remote.DocumentApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ServiceGen {
    //  api =https://dealsfinders.blog/wp-json/tribe/events/v1/events?page=1&per_page=20

    val BASE_URL="https://dealsfinders.blog"

    @Singleton
    @Provides
    fun getIntance():Retrofit{
         val client= OkHttpClient.Builder().build()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    @Singleton
    @Provides
    fun getProductApi(retrofit: Retrofit):DocumentApi{
        return retrofit.create(DocumentApi::class.java)
    }

//    val BASE_URL="http://api.themoviedb.org/"

//    fun getIntance():Retrofit{
//         val client= OkHttpClient.Builder().build()
//        return Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(client)
//            .build()
//    }

//
//    private val client= OkHttpClient.Builder().build()
//    private val retrofit= Retrofit.Builder()
//        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
//        .build()
//
//    fun getMovie(retrofit: Retrofit): DetailApi =
//        retrofit.create(DetailApi::class.java)
//
//    fun <T> buildService(service:Class<T>):T{
//        return retrofit.create(service)
//    }
}