package com.example.yalarbaapp.data_room.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.example.yalarbaapp.data_room.repository.DbConnection
import kotlinx.coroutines.launch

class ListFragmentViewModel(application: Application) : AndroidViewModel(application) {

    val infoCardDao = Room
        .databaseBuilder(application, DbConnection::class.java, "database")
        .build()
        .infoCardDAO()

    val list = MutableLiveData<List<InfoCard>>()

    init {
        val list = mutableListOf<InfoCard>()

        for (i in 1..100) {
            list.add(InfoCard(shortName = "shortName$i", shortDescription = "shortDescription$i"))
        }

        viewModelScope.launch {
            list.forEach {
                infoCardDao.insert(it)
            }
        }
    }



}