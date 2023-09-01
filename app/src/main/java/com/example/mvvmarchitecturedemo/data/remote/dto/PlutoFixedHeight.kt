package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PlutoFixedHeight(
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