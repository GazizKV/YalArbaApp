package com.example.yalarbaapp.data_room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class InfoCard(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "short_name") val shortName: String?,
    @ColumnInfo(name = "short_description") val shortDescription: String?
)
