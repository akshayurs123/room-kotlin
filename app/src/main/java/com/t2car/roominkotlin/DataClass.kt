package com.t2car.roominkotlin

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "UserTable")
data class DataClass(@PrimaryKey(autoGenerate = true) val id: Long,
                     @ColumnInfo(name = "name")val name: String, val age: Int)