package com.example.uppgift1android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uppgift1android.ui.theme.Uppgift1androidTheme
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Uppgift1androidTheme {
                CounterView()
            }
        }
    }
}

@Composable
fun CounterView() {
    var count by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFF66BB6A))
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Uppgift 1",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(35.dp))

        if (count < 10) {
            Button(
                onClick = { count++ },
                modifier = Modifier.padding(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red) 
            ) {
                Text(text = "PLUS", fontSize = 20.sp, color = Color.White)
            }
        }

        Text(
            text = "$count",
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        if (count > 0) {
            Button(
                onClick = { count-- },
                modifier = Modifier.padding(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red) 
            ) {
                Text(text = "MINUS", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCounterScreen() {
    Uppgift1androidTheme {
        CounterView()
    }
}
