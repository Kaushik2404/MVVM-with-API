package com.example.mvvmarchitecturedemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmarchitecturedemo.R
import com.example.mvvmarchitecturedemo.data.remote.dto.Document
import com.example.mvvmarchitecturedemo.data.remote.dto.Event

class ProductPageAdapter( private  val context: Context):PagingDataAdapter<Event,ProductPageAdapter.ProductpageViewHolder> (
    COMPARATOR) {


    class ProductpageViewHolder(iteamView :View )  :RecyclerView.ViewHolder(iteamView) {

        val pname : TextView =iteamView.findViewById(R.id.pname)
        val pimage : ImageView =iteamView.findViewById(R.id.pimage)
    }
    companion object{
         private  val COMPARATOR =object :DiffUtil.ItemCallback<Event>(){
             override fun areItemsTheSame(oldItem: Event, newItem: Event): Boolean {
                return oldItem.id  == newItem.id
             }

             override fun areContentsTheSame(oldItem: Event, newItem: Event): Boolean {
                 return  oldItem == newItem
             }

         }
    }

    override fun onBindViewHolder(holder: ProductpageViewHolder, position: Int) {
       val iteam =getItem(position)
        if(iteam !=null){
            holder.pname.text= iteam.title
            Glide.with(context).load(iteam.image?.url).into(holder.pimage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductpageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ProductpageViewHolder(view)
    }
}