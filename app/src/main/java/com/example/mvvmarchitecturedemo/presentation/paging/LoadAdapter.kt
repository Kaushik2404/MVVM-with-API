package com.example.mvvmarchitecturedemo.presentation.paging

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.paging.LoadStates
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmarchitecturedemo.R

class LoadAdapter :LoadStateAdapter<LoadAdapter.LoderViewHolder>() {

    class LoderViewHolder(iteamView : View ) :RecyclerView.ViewHolder(iteamView){

        val pgbar=iteamView.findViewById<ProgressBar>(R.id.pgbar)

        fun bind (loadState: LoadState){
            pgbar.isVisible=loadState is LoadState.Loading
        }

    }

    override fun onBindViewHolder(holder: LoderViewHolder, loadState: LoadState) {
       holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoderViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.loader_iteam,parent,false)
        return LoderViewHolder(view)
    }


}