package com.socicod.sealonlineguide.ui.weapon

import android.arch.lifecycle.MutableLiveData
import com.socicod.sealonlineguide.Model.Weapon
import com.socicod.sealonlineguide.base.BaseViewModel

class PostViewModel : BaseViewModel() {
    private val weaponTitle = MutableLiveData<String>()
    private val weaponDmg = MutableLiveData<String>()
    private val weaponAcc = MutableLiveData<String>()
    private val weaponMp = MutableLiveData<String>()
    private val weaponAspd = MutableLiveData<String>()
    private val weaponCrit = MutableLiveData<String>()
    private val weaponEva = MutableLiveData<String>()

    fun bind(weapon: Weapon) {
        weaponTitle.value = weapon.pic.toString()
        weaponDmg.value = weapon.dmg.toString()
        weaponAcc.value = weapon.acc.toString()
        weaponMp.value = weapon.mp.toString()
        weaponAspd.value = weapon.aspd.toString()
        weaponCrit.value = weapon.crit.toString()
        weaponEva.value = weapon.eva.toString()
    }

    fun getWeaponTitle(): MutableLiveData<String> {
        return weaponTitle
    }



    fun getWeaponDmg(): MutableLiveData<String> {
        return weaponDmg
    }

    fun getWeaponAcc(): MutableLiveData<String> {
        return weaponAcc
    }
    fun getWeaponMp(): MutableLiveData<String> {
        return weaponMp
    }
    fun getWeaponAspd(): MutableLiveData<String> {
        return weaponAspd
    }
    fun getWeaponCrit(): MutableLiveData<String> {
        return weaponCrit
    }
    fun getWeaponEva(): MutableLiveData<String> {
        return weaponEva
    }

}