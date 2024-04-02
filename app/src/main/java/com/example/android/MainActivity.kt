package com.example.android

import android.content.Intent
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.ui.theme.AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){

  Column (modifier = Modifier.fillMaxSize()){

      val mContext = LocalContext.current
      Text(

          text = "Welcome to Android",
          color = Color.Red,
          fontSize = 20.sp,
          fontStyle = FontStyle.Italic,
          fontWeight = FontWeight.Bold

      )
      Text(text = "Entails developing and creating mobile applications")

      Box(
          modifier = Modifier.align(Alignment.CenterHorizontally),

      ) {
          Button(onClick = {mContext.startActivity(Intent(mContext,Layoutactivity::class.java) )})
          { Text("Next") }
      }
      Box(
          modifier = Modifier.align(Alignment.CenterHorizontally),

          ) {
          Button(onClick = {mContext.startActivity(Intent(mContext,Exploreactivity::class.java) )})
          { Text("explore") }
      }

      Box(
          modifier = Modifier.align(Alignment.CenterHorizontally),

          ) {
          Button(onClick = {mContext.startActivity(Intent(mContext,woofactivity::class.java) )})
          { Text("woof") }
      }






      Spacer(modifier = Modifier.height(10.dp))
      Text(
          text = "Types of cars",
          fontSize = 20.sp,
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Red)
              .height(40.dp)
          ,
          textAlign = TextAlign.Center,
          textDecoration = TextDecoration.Underline,
          color = Color.White,
          fontWeight = FontWeight.Bold

      )
      Text(text = "1. BMW" )
      Text(text = "2. Mercedes Benz" )
      Text(text = "3. Ferari" )
      Text(text = "4. Honda" )
      Text(text = "5. Bughatti" )

      Box(modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.Center) {
          Button(onClick = { mContext.startActivity(Intent(mContext,Destinationactivity::class.java) )}) {
              Text(text = "See more")
          }
      }



      Spacer(modifier = Modifier.height(10.dp))
      Text(
          text = "Types of Fruits",
          fontSize = 20.sp,
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Black)
              .height(30.dp)
          ,
          textAlign = TextAlign.Center,
          color = Color.White,
          fontWeight = FontWeight.Bold

      )

      Text(text = "1. Watermelon" )
      Text(text = "2. Mango" )
      Text(text = "3. Apple" )
      Text(text = "4. Blackberry" )
      Text(text = "5. Banana" )
      Spacer(modifier = Modifier.height(5.dp))
      Divider()


      Spacer(modifier = Modifier.height(5.dp))
      Divider()

      Box (
          modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.Center
      )
      {
          Image(painter = painterResource(id = R.drawable.wallpapers),
                contentDescription ="stones",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop

          )
      }
      Text(text = "eMobilis Training Institute ",
          fontSize = 30.sp,
          fontWeight = FontWeight.Bold,

          )
      Spacer(modifier = Modifier.height(10.dp))
      Button(onClick = {
                       mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
      },
          shape = RoundedCornerShape(5.dp),
          colors = ButtonDefaults.buttonColors(Color.Magenta),
          modifier = Modifier
              .fillMaxWidth()
              .padding(start = 30.dp, end = 30.dp)
      ) {
          Text(text = "Continue")
      }




  }

    
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}


