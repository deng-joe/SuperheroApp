package dev.joe.superhero.data.local.structure

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Url(
    @SerializedName("type")
    @Expose
    val type: String,

    @SerializedName("url")
    @Expose
    val url: String
)
