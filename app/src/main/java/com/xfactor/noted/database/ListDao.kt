package com.xfactor.noted.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlin.collections.List


@Dao
interface ListDao {

    @Query("SELECT * FROM list")
    fun getAll(): List<com.xfactor.noted.database.List<Any?>>

    @Insert
    fun insertAll(vararg list: com.xfactor.noted.database.List<Any?>)

    @Delete
    fun delete(list: com.xfactor.noted.database.List<Any?>)
}