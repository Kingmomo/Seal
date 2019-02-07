package com.socicod.sealonlineguide.base

import android.arch.lifecycle.ViewModel
import com.socicod.sealonlineguide.injection.component.DaggerViewModelInjector
import com.socicod.sealonlineguide.injection.component.ViewModelInjector
import com.socicod.sealonlineguide.injection.module.NetworkModule
import com.socicod.sealonlineguide.ui.post.PostListViewModel
import com.socicod.sealonlineguide.ui.post.PostViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}