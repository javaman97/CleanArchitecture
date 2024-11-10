package com.aman.cleanarchitecture.data.network

import com.aman.cleanarchitecture.data.model.PixabayDTO
import retrofit2.http.GET
import retrofit2.http.Query


const val  BASE_URL = "https://pixabay.com/"
interface ApiService {
    // https://pixabay.com/api/?key=API_SERVICE=yellow+flowers&image_type=photo&pretty=true

    @GET("api")
    suspend fun getSearchImage(
        @Query("key") key:String,
        @Query("q") query: String
    ):PixabayDTO
}