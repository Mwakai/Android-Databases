package com.xfactor.noted.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import com.xfactor.noted.ListItem

@Entity
data class List<T>(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name="title") val title: String
    //@ColumnInfo(name="elements") val elements: MutableList<ListItem>
)
