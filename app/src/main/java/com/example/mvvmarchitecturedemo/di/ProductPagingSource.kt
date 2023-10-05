package com.example.mvvmarchitecturedemo.di

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.mvvmarchitecturedemo.data.remote.DocumentApi
import com.example.mvvmarchitecturedemo.data.remote.dto.Document
import com.example.mvvmarchitecturedemo.data.remote.dto.Event
import com.example.mvvmarchitecturedemo.domain.repository.DocumentRepository
import retrofit2.Response

class ProductPagingSource (private val documentApi: DocumentApi) :
PagingSource<Int,Event> (){
    override fun getRefreshKey(state: PagingState<Int, Event>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
//        if(state.anchorPosition != null ){
//            val anchorPage = state .closestPageToPosition(state.anchorPosition!!)
//            if(anchorPage?.prevKey !=null){
//                return  anchorPage.prevKey!!.plus(1)
//            }
//            else if (anchorPage?.nextKey != null){
//                return anchorPage.nextKey!!.minus(1)
//            }
//
//        }
//        else{
//            return null
//        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Event> {
        return try{
            val position = params.key ?: 1
            val response: Document = documentApi.getDocs(position,10)
            val events: List<Event> = response.events!!.filterNotNull()
            LoadResult.Page(
                data= events ,
                prevKey = if (position==1 ) null else position-1,
                nextKey = if(position== response.totalPages) null else position + 1
            )
        } catch (e :Exception ){
            LoadResult.Error(e)
        }
    }

}