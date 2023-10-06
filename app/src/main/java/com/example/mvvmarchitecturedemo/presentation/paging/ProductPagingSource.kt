package com.example.mvvmarchitecturedemo.presentation.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.mvvmarchitecturedemo.data.remote.DocumentApi
import com.example.mvvmarchitecturedemo.data.remote.dto.Document
import com.example.mvvmarchitecturedemo.data.remote.dto.Event


class ProductPagingSource (private val documentApi: DocumentApi) :
PagingSource<Int,Event> (){
    override fun getRefreshKey(state: PagingState<Int, Event>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }

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