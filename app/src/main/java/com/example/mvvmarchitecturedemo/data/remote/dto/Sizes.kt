package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Sizes(
    @SerializedName("alm-thumbnail")
    val almThumbnail: AlmThumbnail?,
    @SerializedName("pluto-fixed-height")
    val plutoFixedHeight: PlutoFixedHeight?,
    @SerializedName("pluto-fixed-height-image")
    val plutoFixedHeightImage: PlutoFixedHeightImage?,
    @SerializedName("pluto-index-width")
    val plutoIndexWidth: PlutoIndexWidth?,
    @SerializedName("pluto-top-featured-post")
    val plutoTopFeaturedPost: PlutoTopFeaturedPost?
)