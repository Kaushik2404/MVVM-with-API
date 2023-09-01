package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("filter")
    val filter: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("parent")
    val parent: Int?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("taxonomy")
    val taxonomy: String?,
    @SerializedName("term_group")
    val termGroup: Int?,
    @SerializedName("term_taxonomy_id")
    val termTaxonomyId: Int?,
    @SerializedName("urls")
    val urls: Urls?
)