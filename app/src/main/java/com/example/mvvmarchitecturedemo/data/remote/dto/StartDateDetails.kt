package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class StartDateDetails(
    @SerializedName("day")
    val day: String?,
    @SerializedName("hour")
    val hour: String?,
    @SerializedName("minutes")
    val minutes: String?,
    @SerializedName("month")
    val month: String?,
    @SerializedName("seconds")
    val seconds: String?,
    @SerializedName("year")
    val year: String?
)