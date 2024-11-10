package com.aman.cleanarchitecture.presentation.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  AppTopBar (){
    TopAppBar(title = {
       Text( "Clean Architecture - Search Image")
    })
}