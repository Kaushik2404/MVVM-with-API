package com.example.mvvmarchitecturedemo.domain.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.mvvmarchitecturedemo.data.remote.DocumentApi
import com.example.mvvmarchitecturedemo.presentation.paging.ProductPagingSource
import javax.inject.Inject

class DocumentRepository @Inject constructor(private val documentApi: DocumentApi) {
//    private val _docLiveData= MutableLiveData<Document> ()
//    val Docs: LiveData<Document>
//        get() = _docLiveData
//
//    suspend fun getDocs(){
//        val result=documentApi.getDocs()
//        _docLiveData.postValue(result)
//    }

    fun getProduct()= Pager(
        config = PagingConfig(pageSize = 10 , maxSize = 50),
        pagingSourceFactory = { ProductPagingSource(documentApi) }
    ).liveData
}