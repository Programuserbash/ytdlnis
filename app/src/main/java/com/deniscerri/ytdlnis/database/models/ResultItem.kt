package com.deniscerri.ytdlnis.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "results")
data class ResultItem(
    val url: String,
    val title: String,
    val author: String,
    val duration: String,
    val thumb: String,
    val website: String,
    var playlistTitle: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}