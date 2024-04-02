package com.example.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.ui.theme.AndroidTheme

class woofactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            woof()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun woof(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        TopAppBar(title ={Text(text = "Woof", color = Color.Black, fontFamily = FontFamily.Serif,fontSize = 40.sp,fontWeight = FontWeight.ExtraBold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(),)} ,
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),

        )
        Spacer(modifier = Modifier.height(10.dp))

        //end of topappbar
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
               Row {
                   Box(modifier = Modifier
                       .width(45.dp)
                       .height(40.dp)
                       .padding(start = 10.dp, top = 5.dp),
                       contentAlignment = Alignment.Center) {
                       Image(painter = painterResource(id = R.drawable.bg),
                           contentDescription ="",
                           modifier = Modifier
                               .fillMaxSize()
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.FillBounds
                       )

                   }
                   Spacer(modifier = Modifier.width(10.dp))

                  Column {
                      Text(text = "Koda", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                      Text(text = "2 years old", fontSize = 10.sp)
                  }
               }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.image2),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Lola", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "16 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.image4),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Frankie", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.pixel),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Nox", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "8 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Faye", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "8 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Bella", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "14 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card
            //end of card
            Spacer(modifier = Modifier.height(10.dp))
            //card 1
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 10.dp, end = 10.dp)) {
                Row {
                    Box(modifier = Modifier
                        .width(45.dp)
                        .height(40.dp)
                        .padding(start = 10.dp, top = 5.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.FillBounds
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Column {
                        Text(text = "Moana", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                        Text(text = "2 years old", fontSize = 10.sp)
                    }
                }

            }
            //end of card

        }


    }

}

@Preview(showBackground = true)
@Composable
fun WoofPreview() {
   woof()
}