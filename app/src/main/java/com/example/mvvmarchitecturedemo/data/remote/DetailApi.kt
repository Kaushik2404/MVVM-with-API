package com.example.mvvmarchitecturedemo.data.remote

import com.example.mvvmarchitecturedemo.data.remote.dto.movi.MovieDetailDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DetailApi {

//    @GET("/3/discover/movie?sort_by=popularity.desc")
//    suspend fun getMovie():List<MovieDetailDto>
//

    @GET("3/discover/movie?sort_by=popularity.desc")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String? = "57a4269b6c0098d52f01d65572e57972"
    ): Response<MovieDetailDto>

}