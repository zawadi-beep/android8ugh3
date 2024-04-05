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
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.getValue
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
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
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

      Row {
              Button(onClick = {mContext.startActivity(Intent(mContext,Exploreactivity::class.java) )})
              { Text("explore") }


              Button(onClick = {mContext.startActivity(Intent(mContext,woofactivity::class.java) )})
              { Text("woof") }
          Button(onClick = {mContext.startActivity(Intent(mContext,Destinationactivity::class.java) )})
          { Text("Destiny") }





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

      Box (
          modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.Center
      )
      {
          Image(painter = painterResource(id = R.drawable.wallpapers),
                contentDescription ="stones",
                modifier = Modifier
                    .size(20.dp)
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

      //Lottie Animation
      val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.hamster))
      val progress by animateLottieCompositionAsState(composition)
      LottieAnimation(composition, progress,
          modifier = Modifier.size(300.dp)
      )




  }

    
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}


