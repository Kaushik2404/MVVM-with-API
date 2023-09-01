package com.example.mvvmarchitecturedemo.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarchitecturedemo.domain.repository.DocumentRepository

class MainViewModalFactory(private val documentRepository: DocumentRepository):ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModal(documentRepository) as T
    }

}

//class MainViewModalFactory(private val movieRepo: MovieRepo):ViewModelProvider.Factory{
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return MainViewModal(movieRepo) as T
//    }
//
//}