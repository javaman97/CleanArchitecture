package com.aman.cleanarchitecture.data.model

data class PixabayDTO(
    val hits: List<HitDTO> = listOf(),
    val total: Int = 0,
    val totalHits: Int = 0
)