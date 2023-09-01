package com.example.mvvmarchitecturedemo.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmarchitecturedemo.data.remote.DetailApi
import com.example.mvvmarchitecturedemo.data.remote.dto.movi.MovieDetailDto

class MovieRepo(private val detailApi: DetailApi) {
    private val _movieLiveData=MutableLiveData<MovieDetailDto> ()
    val movie: LiveData<MovieDetailDto>
        get() = _movieLiveData

    suspend fun getMovies(){
        val result=detailApi.getPopularMovies()
        if(result?.body()!=null){
            _movieLiveData.postValue(result.body())
        }
    }
}