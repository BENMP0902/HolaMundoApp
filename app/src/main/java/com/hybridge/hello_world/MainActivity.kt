package com.hybridge.hello_world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hybridge.hello_world.ui.theme.Hello_WorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello_WorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HolaMundoApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun HolaMundoApp(modifier: Modifier = Modifier) {
    Text(
        text = "Hola Mundo",
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.primary
    )
}

@Preview(showBackground = true)
@Composable
fun HolaMundoAppPreview() {
    Hello_WorldTheme {
        HolaMundoApp()
    }
}

