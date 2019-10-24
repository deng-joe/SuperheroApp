package dev.joe.superhero.data.entity

import androidx.room.Entity
import androidx.room.TypeConverters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import dev.joe.superhero.converter.*
import dev.joe.superhero.data.structure.Image
import dev.joe.superhero.data.structure.Url
import java.util.*
import kotlin.collections.ArrayList

@Entity(tableName = "series", primaryKeys = ["id"])
data class Series(
    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("title")
    @Expose
    val title: String,

    @SerializedName("description")
    @Expose
    val description: String?,

    @SerializedName("urls")
    @Expose
    @TypeConverters(UrlsConverter::class)
    val urls: ArrayList<Url>?,

    @SerializedName("resourceURI")
    @Expose
    val resourceUri: String?,

    @SerializedName("startYear")
    @Expose
    val startYear: Int?,

    @SerializedName("endYear")
    @Expose
    val endYear: Int?,

    @SerializedName("rating")
    @Expose
    val rating: String?,

    @SerializedName("modified")
    @Expose
    val modified: Date?,

    @SerializedName("thumbnail")
    @Expose
    val thumbnail: Image?,

    @SerializedName("events")
    @Expose
    @TypeConverters(EventsConverter::class)
    val events: List<Event>?,

    @SerializedName("comics")
    @Expose
    @TypeConverters(ComicsConverter::class)
    val comics: List<Comic>?,

    @SerializedName("characters")
    @Expose
    @TypeConverters(CharactersConverter::class)
    val characters: List<Character>?,

    @SerializedName("creators")
    @Expose
    @TypeConverters(CreatorsConverter::class)
    val creators: List<Creator>?,

    @SerializedName("stories")
    @Expose
    @TypeConverters(StoriesConverter::class)
    val stories: List<Stories>?
)
