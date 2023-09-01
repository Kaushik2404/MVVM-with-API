package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("collection")
    val collection: String?,
    @SerializedName("self")
    val self: String?
)