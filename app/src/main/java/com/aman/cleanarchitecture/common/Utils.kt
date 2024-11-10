package com.aman.cleanarchitecture.common

import com.aman.cleanarchitecture.data.model.HitDTO
import com.aman.cleanarchitecture.domain.model.ImageModel

//Extension Function
fun HitDTO.toDomainModel():ImageModel{
    return ImageModel(
        imageUrl = this.largeImageURL
    )
}

const val API_KEY="46999883-c4ba90dc327939302503459d9"
const val  BASE_URL = "https://pixabay.com/"