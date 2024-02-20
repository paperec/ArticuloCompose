package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.articulocompose.ui.theme.ArticuloComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun GreetingText (
    titulo: String,
    intro:String,
    texto: String) {
    Box {
        Text(
            text = titulo,
            fontSize = 24.sp,

        )
        Text(
            text = intro
        )
        Text(
            text = texto
        )
    }
}

@Composable
fun ArticuloCompose(modifier: Modifier = Modifier){

    val image = painterResource(R.drawable.bg_compose_background)
    Box (modifier) {
        Image (
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
            )
        GreetingText ()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloComposeTheme {
        Greeting("Android")
    }
}