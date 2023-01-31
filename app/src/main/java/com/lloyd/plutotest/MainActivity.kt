package com.lloyd.plutotest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lloyd.plutotest.ui.theme.PlutoTestTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PlutoTestTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxWidth(), color = MaterialTheme.colors.background) {
          Crash()
        }
      }
    }
  }
}

@Composable
fun Crash() {
  Button(onClick = {
    throw NullPointerException()
  }) {
    Text(text = "Crash app")
  }
}