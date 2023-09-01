package com.example.mvvmarchitecturedemo.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmarchitecturedemo.data.remote.DocumentApi
import com.example.mvvmarchitecturedemo.data.remote.dto.Document

class DocumentRepository(private val documentApi: DocumentApi) {
    private val _docLiveData= MutableLiveData<Document> ()
    val Docs: LiveData<Document>
        get() = _docLiveData

    suspend fun getDocs(){
        val result=documentApi.getDocs()
        _docLiveData.postValue(result)
    }
}