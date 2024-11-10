package com.aman.cleanarchitecture.data.repository

import com.aman.cleanarchitecture.common.toDomainModel
import com.aman.cleanarchitecture.data.network.ApiService
import com.aman.cleanarchitecture.domain.model.ImageModel
import com.aman.cleanarchitecture.domain.repository.ImageRepository

class ImageRepositoryImpl(private val apiService: ApiService):ImageRepository {
    override suspend fun getSearchImage(query: String): List<ImageModel> {
        try{
            return apiService.getSearchImage(
                key = "46999883-c4ba90dc327939302503459d9&q",
                query = query
            ).hits.map { it.toDomainModel() }

        } catch (e:java.lang.Exception){
            throw Exception(e)
        }
    }
}