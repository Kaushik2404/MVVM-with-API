package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("extension")
    val extension: String?,
    @SerializedName("filesize")
    val filesize: Int?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("sizes")
    val sizes: Sizes?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)