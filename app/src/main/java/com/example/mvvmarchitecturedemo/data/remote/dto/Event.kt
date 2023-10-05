package com.example.mvvmarchitecturedemo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("all_day")
    val allDay: Boolean?,
    @SerializedName("author")
    val author: String?,
    @SerializedName("categories")
    val categories: List<Category?>?,
    @SerializedName("cost")
    val cost: String?,
    @SerializedName("cost_details")
    val costDetails: CostDetails?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("date_utc")
    val dateUtc: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("end_date")
    val endDate: String?,
    @SerializedName("end_date_details")
    val endDateDetails: EndDateDetails?,
    @SerializedName("excerpt")
    val excerpt: String?,
    @SerializedName("featured")
    val featured: Boolean?,
    @SerializedName("global_id")
    val globalId: String?,
    @SerializedName("global_id_lineage")
    val globalIdLineage: List<String?>?,
    @SerializedName("hide_from_listings")
    val hideFromListings: Boolean?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image")
    val image: Image?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("modified_utc")
    val modifiedUtc: String?,
    @SerializedName("organizer")
    val organizer: List<Any?>?,
    @SerializedName("rest_url")
    val restUrl: String?,
    @SerializedName("show_map")
    val showMap: Boolean?,
    @SerializedName("show_map_link")
    val showMapLink: Boolean?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("start_date")
    val startDate: String?,
    @SerializedName("start_date_details")
    val startDateDetails: StartDateDetails?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("sticky")
    val sticky: Boolean?,
    @SerializedName("tags")
    val tags: List<Any?>?,
    @SerializedName("timezone")
    val timezone: String?,
    @SerializedName("timezone_abbr")
    val timezoneAbbr: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("utc_end_date")
    val utcEndDate: String?,
    @SerializedName("utc_end_date_details")
    val utcEndDateDetails: UtcEndDateDetails?,
    @SerializedName("utc_start_date")
    val utcStartDate: String?,
    @SerializedName("utc_start_date_details")
    val utcStartDateDetails: UtcStartDateDetails?,
    @SerializedName("venue")
    val venue: List<Any?>?,
    @SerializedName("website")
    val website: String?
)