package com.example.mvvmarchitecturedemo.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmarchitecturedemo.data.remote.dto.Document
import com.example.mvvmarchitecturedemo.domain.repository.DocumentRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
class MainViewModal(private val documentRepository: DocumentRepository):ViewModel() {

    init{
        viewModelScope.launch(Dispatchers.IO) {
            documentRepository.getDocs()
        }
    }

    val docs: LiveData<Document>
        get() =documentRepository.Docs

}
//
//class MainViewModal (private val movieRepository: MovieRepo):ViewModel() {
//
//    init{
//        viewModelScope.launch(Dispatchers.IO) {
//            movieRepository.getMovies()
//        }
//    }
//
////    private val _movies = MutableLiveData<List<Movie>>()
////    var movies: LiveData<List<Movie>> = _movies
//
//    val movies:LiveData<MovieDetailDto>
//        get() =movieRepository.movie
//
////    fun fetchMovies() {
////
////        viewModelScope.launch {
////            try {
////                val res=movieRepository.getMovies()
////                res?.results.let {
////                    _movies.value= it as List<Movie>
////                }
////
////            } catch (e: Exception) {
////                // Handle error here
////            }
////        }
////    }
//}