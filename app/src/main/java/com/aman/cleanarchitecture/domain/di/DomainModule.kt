package com.aman.cleanarchitecture.domain.di

import com.aman.cleanarchitecture.domain.repository.ImageRepository
import com.aman.cleanarchitecture.domain.usecases.GetSearchImageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetSearchUseCase(imageRepository: ImageRepository):GetSearchImageUseCase{
        return GetSearchImageUseCase(imageRepository)
    }

}