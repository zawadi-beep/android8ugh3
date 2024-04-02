package com.example.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.ui.theme.AndroidTheme

class Destinationactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mydestination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mydestination(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title ={Text(text = "Destination", color = Color.White)} ,
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription ="arrowback",
                        tint = Color.White
                    )
                }
            },
            actions = {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings",
                    tint = Color.White
                )

            }


        )
        Spacer(modifier = Modifier.height(10.dp))
        //end of topappbar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.pixel) ,
                contentDescription = "Pixel",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(text = "Let's plan your next vacation",
                 fontSize = 40.sp,
                 color = Color.Black,
                 textAlign = TextAlign.Center,
                 fontWeight = FontWeight.Bold
                )
        }
        //end of box
        Spacer(modifier = Modifier.height(20.dp))
        //searchbar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value =search,
            onValueChange = {search = it},
            placeholder = { Text(text = "What's your destination?")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search icon")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions( keyboardType= KeyboardType.Text)

        )
        Spacer(modifier = Modifier.height(20.dp))
        //end of searchbar
        Text(text = "Recently viewed destinations", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.padding(start = 20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //card 1
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)) {
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.bg),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Text(text = "Kenya",fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 2
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)) {
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.wallpapers),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Text(text = "Amazon",fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 3
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)) {
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.image2),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Text(text = "Lagos",fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 4
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)) {
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.pixel),
                            contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                    Text(text = "Brazil",fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DestinationPreview() {
   Mydestination()
}