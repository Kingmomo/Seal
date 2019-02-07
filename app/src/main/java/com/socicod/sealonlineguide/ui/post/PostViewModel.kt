package com.socicod.sealonlineguide.ui.post

import android.arch.lifecycle.MutableLiveData
import com.socicod.sealonlineguide.Model.Weapon
import com.socicod.sealonlineguide.base.BaseViewModel

class PostViewModel : BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()
    private val postLevel = MutableLiveData<String>()

    fun bind(post: Weapon) {
        postTitle.value = post.nama
        postBody.value = post.agi.toString()
        postLevel.value = post.level.toString()
    }

    fun getPostTitle(): MutableLiveData<String> {
        return postTitle
    }

    fun getPostBody(): MutableLiveData<String> {
        return postBody
    }

    fun getPostLevel(): MutableLiveData<String> {
        return postLevel
    }
}