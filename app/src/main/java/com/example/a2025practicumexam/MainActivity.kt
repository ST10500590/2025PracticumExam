package com.example.a2025practicumexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a2025practicumexam.ui.theme._2025PracticumExamTheme
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import android.content.Intent
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _2025PracticumExamTheme (){

                Column(  modifier= Modifier.fillMaxSize(), //to expand the wrap to fill the entire screen
                    horizontalAlignment=Alignment.CenterHorizontally, //this is going to center the composables horizontally
                    verticalArrangement = Arrangement.Center  )
                {
                    Text(text = "Welcome")
                    Button(onClick = {
                        var start = Intent(this@MainActivity, MainScreen::class.java)
                        startActivity(start)
                    })
                    {
                        Text("Start") // Text of the button to be "Start"
                    }
                }


            }
        }
    }
}
