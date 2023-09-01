package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PlutoTopFeaturedPost(
    @SerializedName("filesize")
    val filesize: Int?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("mime-type")
    val mimeType: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)