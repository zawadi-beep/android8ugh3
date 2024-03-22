package com.example.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.ui.theme.AndroidTheme



class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun layout(){

    Column(modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

    //TopAppBar
    TopAppBar(title ={Text(text = "Home", color = Color.White)} ,
              colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
              navigationIcon = {
                  IconButton(onClick = {
                      mContext.startActivity(Intent(mContext,MainActivity::class.java))
                  }) {
                      Icon(
                          imageVector = Icons.Default.ArrowBack,
                          contentDescription ="arrowback",
                          tint = Color.White
                      )}
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
        Text(text = "Breeds of Dogs",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )
        //Row1
        Row{
           Image(painterResource(id =R.drawable.dog1 ),
               contentDescription = "Bulldog",
               modifier = Modifier.size(width = 200.dp, height = 100.dp)
           )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Bulldog", fontWeight = FontWeight.Bold)
                Text(text = "The Bulldog is a British breed of dog of mastiff type. It may also be known as the English Bulldog or British Bulldog.")
            }
        }
        //end of row
        Spacer(modifier = Modifier.height(20.dp))
        //Row2
        Row{
            Image(painterResource(id =R.drawable.image4 ),
                contentDescription = "German Shepherd",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "German Shepherd", fontWeight = FontWeight.Bold)
                Text(text = "German shepherd is a British breed of dog of mastiff type. It may also be known as the English Bulldog or British Bulldog.")
            }
        }
        //end of row
        Spacer(modifier = Modifier.height(20.dp))
        //Row3
        Row{
            Image(painterResource(id =R.drawable.image1 ),
                contentDescription = "Husky",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Husky", fontWeight = FontWeight.Bold)
                Text(text = "Husky is a British breed of dog of mastiff type. It may also be known as the English Bulldog or British Bulldog.")
            }
        }

        Spacer(modifier = Modifier.height(300.dp))

        Button(onClick = {  mContext.startActivity(Intent(mContext,intentactivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        ) {
            Text(text = "Next", color = Color.Black)
        }


    }


}

@Preview(showBackground = true)
@Composable
fun layoutpreview(){
    layout()
}