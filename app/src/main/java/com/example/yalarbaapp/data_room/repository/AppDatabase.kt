package com.example.yalarbaapp.data_room.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.yalarbaapp.data_room.DAO.InfoCardDAO
import com.example.yalarbaapp.data_room.model.InfoCard

@Database(entities = [InfoCard::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun infoCardDAO(): InfoCardDAO
}


/**
val db = Room.databaseBuilder(
applicationcontext,
AppDatabase::class.java, "database-name"
).build()

 val userDao = db.infocardDAO()
 val user: LIst<InfoCard> = InfoCardDAO.getAll()
 */