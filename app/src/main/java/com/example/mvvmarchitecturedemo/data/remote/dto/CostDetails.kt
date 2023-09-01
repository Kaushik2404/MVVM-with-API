package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class CostDetails(
    @SerializedName("currency_code")
    val currencyCode: String?,
    @SerializedName("currency_position")
    val currencyPosition: String?,
    @SerializedName("currency_symbol")
    val currencySymbol: String?,
    @SerializedName("values")
    val values: List<String?>?
)