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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.android.ui.theme.AndroidTheme

class chairactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            chair()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun chair(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title = {  },
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
                IconButton(onClick = { /*TODO*/ }) {

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Share",
                        tint = Color.Black
                    )
                }



                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "search",
                        tint = Color.Black
                    )


                }


            }


        )
        Spacer(modifier = Modifier.height(10.dp))
        //end of topappbar
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            Row {
                Text(text = "Chairs", fontWeight = FontWeight.ExtraBold, fontSize =30.sp, fontFamily = FontFamily.SansSerif)

                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Tables", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp, fontFamily = FontFamily.SansSerif)
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Sofa", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp, fontFamily = FontFamily.SansSerif)
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Bed", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp, fontFamily = FontFamily.SansSerif)
            }
            //Row 1
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.padding(start = 25.dp)) {
                //column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(150.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.chair),
                                contentDescription = "New York",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    Column (modifier = Modifier.width(180.dp)){
                        Text(
                            text = "Amos Chair",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,

                            )
                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "There are also escalators in .",
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                       Row {
                           Text(
                               text = "Ksh 1500",
                               fontSize = 15.sp,
                               fontFamily = FontFamily.Serif,
                               color = Color.Blue
                           )

                           Icon(imageVector = Icons.Default.ShoppingCart,
                               contentDescription = "favorite", tint = Color.Black,
                               modifier = Modifier

                                   .padding(10.dp))
                       }


                    }

                }

                //end of column 1
                Spacer(modifier = Modifier.width(20.dp))
                //column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.bg),
                                contentDescription = "New York",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favorite", tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Brazil",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Blue
                        )
                    }
                    Text(
                        text = "12000 reviewers",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Text(
                        text = "From Ksh 134000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Row {
                        OutlinedButton(

                            onClick = {
                                val callIntent = Intent(Intent.ACTION_DIAL)
                                callIntent.data = "tel:072*****37".toUri()
                                mContext.startActivity(callIntent)
                            }

                        ) {
                            Text(text = "Call")

                        }
                        Spacer(modifier = Modifier.width(5.dp))
                        OutlinedButton(

                            onClick = {
                                val shareIntent = Intent(Intent.ACTION_SEND)
                                shareIntent.type = "text/plain"
                                shareIntent.putExtra(
                                    Intent.EXTRA_EMAIL,
                                    arrayOf("tourguide@gmail.com")
                                )
                                shareIntent.putExtra(
                                    Intent.EXTRA_SUBJECT,
                                    "Request for a tour visit"
                                )
                                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this me.")
                                mContext.startActivity(shareIntent)
                            }

                        ) {
                            Text(text = "Email")
                        }
                    }
                }

                //end of column 2


            }
        }
    }
            //end row1

}

@Preview(showBackground = true)
@Composable
fun ChairPreview() {
    chair()
}