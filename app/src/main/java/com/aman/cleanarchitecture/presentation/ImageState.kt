package com.aman.cleanarchitecture.presentation

import com.aman.cleanarchitecture.domain.model.ImageModel

data class ImageState(
    val isLoading:Boolean = false,
    val data: List<ImageModel>? = null,
    val error: String = ""
)