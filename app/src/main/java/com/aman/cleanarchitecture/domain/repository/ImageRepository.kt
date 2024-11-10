package com.aman.cleanarchitecture.domain.repository

import com.aman.cleanarchitecture.domain.model.ImageModel
import retrofit2.http.Query

interface ImageRepository {

    suspend fun getSearchImage(query: String):List<ImageModel>
}