package com.example.canvas_ejemplo

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoverCan() {
    Scaffold(
        topBar = { myTopAppBar() }
    ) {
        Column(
            Modifier.padding(top = it.calculateTopPadding())
        ) {
            canvas()
        }
    }
}