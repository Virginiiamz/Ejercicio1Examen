package com.munozcastrovirginia.examenEJ1.ui

import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.munozcastrovirginia.examenEJ1.model.Videojuegos

@Composable
fun VideojuegoScreen() {
    val listaVideojuegos = listOf(
        Videojuegos("Juego 1", 200.0, "https://loremflickr.com/400/400/seville?lock=1"),
        Videojuegos("Juego 2", 150.0, "https://loremflickr.com/400/400/seville?lock=2"),
        Videojuegos("Juego 3", 250.0, "https://loremflickr.com/400/400/seville?lock=3"),
        Videojuegos("Juego 4", 300.0, "https://loremflickr.com/400/400/seville?lock=4"),
        Videojuegos("Juego 5", 100.0, "https://loremflickr.com/400/400/seville?lock=5"),
        Videojuegos("Juego 6", 200.0, "https://loremflickr.com/400/400/seville?lock=6")
    )

    LazyColumn {
        items(listaVideojuegos) { videojuego ->
            VideojuegoItem(videojuego)
        }
    }

}

@Composable
fun VideojuegoItem(videojuegos: Videojuegos) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        AsyncImage(
            model = videojuegos.imageUrl,
            contentDescription = videojuegos.name
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(videojuegos.name)
        Spacer(modifier = Modifier.height(8.dp))
        Text(videojuegos.price.toString())
    }
}