package com.aman.cleanarchitecture.common

import com.aman.cleanarchitecture.data.model.HitDTO
import com.aman.cleanarchitecture.domain.model.ImageModel

//Extension Function
fun HitDTO.toDomainModel():ImageModel{
    return ImageModel(
        imageUrl = this.largeImageURL
    )
}