package com.aman.cleanarchitecture.domain.usecases

import com.aman.cleanarchitecture.common.Resource
import com.aman.cleanarchitecture.domain.model.ImageModel
import com.aman.cleanarchitecture.domain.repository.ImageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetSearchImageUseCase(private val imageRepository: ImageRepository ) {

    operator fun invoke(query: String): Flow<Resource<List<ImageModel>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = imageRepository.getSearchImage(query)))
        } catch (e:java.lang.Exception){
            emit(Resource.Error(message = e.message.toString()))
        }

    }


}