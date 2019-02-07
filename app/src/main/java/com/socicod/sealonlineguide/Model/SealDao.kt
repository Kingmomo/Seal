package com.socicod.sealonlineguide.Model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface SealDao {
    @get:Query("SELECT * FROM weapon")
    val all: List<Weapon>

    @Insert
    fun insertAll(vararg weapon : Weapon)
}