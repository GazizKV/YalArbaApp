package com.example.yalarbaapp.data_room.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.yalarbaapp.data_room.DAO.InfoCardDAO
import com.example.yalarbaapp.data_room.model.InfoCard

@Database(entities = [InfoCard::class], version = 1)
abstract class DbConnection : RoomDatabase() {
    abstract fun infoCardDAO(): InfoCardDAO
}
