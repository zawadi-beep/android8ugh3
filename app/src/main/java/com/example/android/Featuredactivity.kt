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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
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
import com.example.android.ui.theme.gold

class Featuredactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            featured()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun featured(){


    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )
                }
            },
            actions = {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Shop",
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Settings",
                    tint = Color.Black
                )

            }


        )
        Spacer(modifier = Modifier.height(10.dp))
        //end of topappbar

        Row {
            Text(text = "Featured", fontWeight = FontWeight.ExtraBold, fontSize =30.sp, fontFamily = FontFamily.SansSerif)

            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "New", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp, fontFamily = FontFamily.SansSerif)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "Collection", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp, fontFamily = FontFamily.SansSerif)
        }


        Card(modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                ) {

                Image(painter = painterResource(id = R.drawable.shopping),
                    contentDescription ="stones",
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )

                Column (modifier = Modifier
                    .width(200.dp)
                    .padding(40.dp)) {
                    Text(text = "The Classic", fontWeight = FontWeight.Bold,color = gold)
                    Text(text = "There are also escalators in big stores which.", fontWeight = FontWeight.Bold,color  = Color.Black)

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "arrowback",
                        tint = Color.Black
                    )

                }


            }

        }


        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(text = "Best sellers", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.padding(start = 20.dp))

            Spacer(modifier = Modifier.width(180.dp))

            Text(text = "View all", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, color = gold)

        }



        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))

        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(text = "Hand-picks", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.padding(start = 20.dp))

            Spacer(modifier = Modifier.width(180.dp))

            Text(text = "View all", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, color = gold)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))
            //card 1
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Column {

                    Image(
                        painter = painterResource(id = R.drawable.chair),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            //end of card
            Spacer(modifier = Modifier.width(8.dp))

        }







    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    featured()
}