package com.example.mvvmarchitecturedemo.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.mvvmarchitecturedemo.data.remote.dto.Document
import com.example.mvvmarchitecturedemo.domain.repository.DocumentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModal @Inject constructor(private val documentRepository: DocumentRepository):ViewModel() {

    val list = documentRepository.getProduct().cachedIn(viewModelScope)

//    init{
//        viewModelScope.launch(Dispatchers.IO) {
//            documentRepository.getDocs()
//        }
//    }
//
//    val docs: LiveData<Document>
//        get() =documentRepository.Docs

}