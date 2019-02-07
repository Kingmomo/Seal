package com.socicod.sealonlineguide.network

import com.socicod.sealonlineguide.Model.Weapon
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("weapon")
    fun getPosts(): Observable<List<Weapon>>
}