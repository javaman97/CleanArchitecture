package com.aman.cleanarchitecture.data.di

import com.aman.cleanarchitecture.common.BASE_URL
import com.aman.cleanarchitecture.data.network.ApiService
import com.aman.cleanarchitecture.data.repository.ImageRepositoryImpl
import com.aman.cleanarchitecture.domain.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    fun provideImageRepo(apiService: ApiService): ImageRepository {
        return ImageRepositoryImpl(
            apiService
        )
    }

}