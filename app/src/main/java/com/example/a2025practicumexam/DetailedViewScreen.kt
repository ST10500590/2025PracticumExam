package com.example.a2025practicumexam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a2025practicumexam.ui.theme._2025PracticumExamTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*

import androidx.compose.ui.unit.dp
import com.example.a2025practicumexam.MovieData.Comments
import com.example.a2025practicumexam.MovieData.Director
import com.example.a2025practicumexam.MovieData.MovieTitle
import com.example.a2025practicumexam.MovieData.Ratings


class DetailedViewScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _2025PracticumExamTheme()
            {

                Column()
                {
                    Spacer(modifier = Modifier.size(15.dp))
                    Row()
                    {

                        Column()
                        {
                            Text(text = " Movie Title")
                            Text(text = "$MovieTitle")
                        }
                        Divider(
                            color = Color.Gray, // Customize divider color
                            modifier = Modifier
                                .fillMaxHeight() // Make the divider fill the available height
                                .width(1.dp))
                        Column()
                        {
                            Text(text = " Director")
                            Text(text = "$Director")
                        }
                        Divider(
                            color = Color.Gray, // Customize divider color
                            modifier = Modifier
                                .fillMaxHeight() // Make the divider fill the available height
                                .width(1.dp))
                        Column()
                        {
                            Text(text = " Ratings")
                            Text(text = "$Ratings")
                        }
                        Divider(
                            color = Color.Gray, // Customize divider color
                            modifier = Modifier
                                .fillMaxHeight() // Make the divider fill the available height
                                .width(1.dp))

                        Column()
                        {
                            Text(text = " Comments")
                            Text(text = "$Comments")
                        }

                    }
                    Button(onClick = {
                        var back = Intent(this@DetailedViewScreen, MainScreen::class.java)
                        startActivity(back)
                    })
                    {
                        Text("Back") // Text of the button to be "Back"
                    }
                }
            }
        }
    }
}
