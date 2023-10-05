package com.example.mvvmarchitecturedemo.data.remote

import com.example.mvvmarchitecturedemo.data.remote.dto.Document
import retrofit2.http.GET
import retrofit2.http.Query


//https://dealsfinders.blog/wp-json/tribe/events/v1/events?page=1&per_page=20

interface DocumentApi {

//    @GET("/wp-json/tribe/events/v1/events?page=1&per_page=20")
//    suspend fun getDocs(
//    ): Document

    @GET("/wp-json/tribe/events/v1/events")
    suspend fun getDocs(
        @Query("page") page : Int,
        @Query("per_page") per_page : Int,
    ): Document
}