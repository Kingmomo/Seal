package com.socicod.sealonlineguide.Model.Databases

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.socicod.sealonlineguide.Model.SealDao
import com.socicod.sealonlineguide.Model.Weapon

@Database(entities = [Weapon::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sealDao(): SealDao
}