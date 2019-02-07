package com.socicod.sealonlineguide.Model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Weapon(
    @field:PrimaryKey
    val id: String,
    val nama: String?,
    val pic: String?,
    val dmg: Int?,
    val acc: Int?,
    val mp: Int?,
    val aspd: Int?,
    val crit: Int?,
    val eva: Int?,
    val str: Int?,
    val agi: Int?,
    val Int: Int?,
    val wis: Int?,
    val luk: Int?,
    val level: Int?,
    val leveljobs: Int?,
    val classjob: String?
)