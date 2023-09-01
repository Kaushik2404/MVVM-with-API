package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Document(
    @SerializedName("events")
    val events: List<Event?>?,
    @SerializedName("next_rest_url")
    val nextRestUrl: String?,
    @SerializedName("rest_url")
    val restUrl: String?,
    @SerializedName("total")
    val total: Int?,
    @SerializedName("total_pages")
    val totalPages: Int?
)