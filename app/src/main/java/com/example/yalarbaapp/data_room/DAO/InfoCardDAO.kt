package com.example.yalarbaapp.data_room.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.yalarbaapp.data_room.model.InfoCard

@Dao
interface InfoCardDAO {
    @Query("SELECT * FROM infocard")
    fun getAll(): List<InfoCard>

    @Query("SELECT * FROM infocard WHERE uid IN (:cardid)")
    fun getByIds(cardid: IntArray): List<InfoCard>

    @Query("SELECT * FROM infocard WHERE short_name LIKE (:name) AND short_description LIKE (:description) LIMIT 1")
    fun findByName(name: String, description: String): InfoCard

    @Insert
    fun insertAll(vararg infocards: InfoCard)

    @Delete
    fun delete(infoCard: InfoCard)
}