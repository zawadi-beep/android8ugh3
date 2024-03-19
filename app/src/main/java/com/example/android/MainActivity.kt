package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
      Text(

          text = "Welcome to Android",
          color = Color.Red,
          fontSize = 30.sp,
          fontStyle = FontStyle.Italic,
          fontWeight = FontWeight.Bold

      )
      Text(text = "Entails developing and creating mobile applications")
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

      Text(
          text = "Types of Fruits",
          fontSize = 30.sp,
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Black)
              .height(40.dp)
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
      Text(
          text = "Fruits are an excellent source of essential vitamins and minerals, and they are high in fiber. Fruits also provide a wide range of health-boosting antioxidants, including flavonoids. Eating a diet high in fruits and vegetables can reduce a person's risk of developing heart disease, cancer, inflammation, and diabetes.",
          color = Color.Magenta,
          fontFamily = FontFamily.Cursive
      )

  }

    
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}

