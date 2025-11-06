package com.example.a2025practicumexam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a2025practicumexam.ui.theme._2025PracticumExamTheme
import kotlin.text.get
import kotlin.text.set

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _2025PracticumExamTheme()
            {
                var averageRating by remember()
                {
                    mutableStateOf<Double?>(null)
                }


                Column (modifier= Modifier.fillMaxSize(), //to expand the wrap to fill the entire screen
                    horizontalAlignment=Alignment.CenterHorizontally, //this is going to center the composables horizontally
                    verticalArrangement = Arrangement.Center){
                    Text(
                        text = "Enter Movie Details",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Black
                    )

                    Divider()

                    LazyColumn(Modifier.weight(1f)) {
                        itemsIndexed(MovieData.MovieTitle) { index, MovieTitle ->
                            Card(Modifier.fillParentMaxWidth().padding(vertical = 6.dp)) {
                                Column(modifier= Modifier.fillMaxSize(), //to expand the wrap to fill the entire screen
                                    horizontalAlignment=Alignment.CenterHorizontally, //this is going to center the composables horizontally
                                    verticalArrangement = Arrangement.Center)
                                {
                                    OutlinedTextField(
                                        value = MovieData.MovieTitle[index],
                                        onValueChange = { MovieData.MovieTitle[index] = it },
                                        label = { Text("Movie Title") },
                                        modifier = Modifier.width(100.dp)
                                    )

                                    Spacer(modifier = Modifier.size(30.dp))

                                    OutlinedTextField(
                                        value = MovieData.Director[index],
                                        onValueChange = { MovieData.Director[index] = it },
                                        label = { Text("Director") },
                                        modifier = Modifier.width(100.dp)
                                    )

                                    Spacer(modifier = Modifier.size(30.dp))

                                    OutlinedTextField(
                                        value = MovieData.Ratings[index],
                                        onValueChange = { MovieData.Ratings[index] = it },
                                        label = { Text("Ratings") },
                                        modifier = Modifier.width(100.dp)
                                    )

                                    Spacer(modifier = Modifier.size(30.dp))

                                    OutlinedTextField(
                                        value = MovieData.Comments[index],
                                        onValueChange = { MovieData.Comments[index] = it },
                                        label = { Text("Comments") },
                                        modifier = Modifier.width(100.dp)
                                    )

                                    Spacer(modifier = Modifier.size(30.dp))


                                }
                            }
                        }
                    }






//



                    Row()
                    {
                        Button(onClick = {})
                        {
                            Text("Add Movie") // Text of the button to be "Start"
                        }

                        Button(onClick = {
                            var ViewReviews = Intent(this@MainScreen, DetailedViewScreen::class.java)
                            startActivity(ViewReviews)
                        })
                        {
                            Text("View Reviews") // Text of the button to be "Start"
                        }
                    }
                }

            }
        }
    }
}

