package com.aman.cleanarchitecture.data.repository

import com.aman.cleanarchitecture.common.API_KEY
import com.aman.cleanarchitecture.common.toDomainModel
import com.aman.cleanarchitecture.data.network.ApiService
import com.aman.cleanarchitecture.domain.model.ImageModel
import com.aman.cleanarchitecture.domain.repository.ImageRepository

class ImageRepositoryImpl(private val apiService: ApiService):ImageRepository {
    override suspend fun getSearchImage(query: String): List<ImageModel> {
        try{
            return apiService.getSearchImage(
                key = API_KEY,
                query = query
            ).hits.map { it.toDomainModel() }

        } catch (e:java.lang.Exception){
            throw Exception(e)
        }
    }
}