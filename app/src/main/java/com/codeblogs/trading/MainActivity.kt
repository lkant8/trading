package com.codeblogs.trading

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codeblogs.trading.ui.theme.TradingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TradingTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android Dev Now DevOps Setup successfully ")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Card(
        modifier = Modifier,
        shape = MaterialTheme.shapes.medium,
        backgroundColor = Color.Blue,
        contentColor = contentColorFor(backgroundColor),
        border  = null,
        elevation = 1.dp,

    ) {
        Text(text = "Hello $name!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TradingTheme {
        Greeting("Android")
    }
}