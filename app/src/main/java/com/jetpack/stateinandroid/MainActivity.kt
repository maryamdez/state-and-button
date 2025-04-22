package com.jetpack.stateinandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.stateinandroid.ui.theme.StateInAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StateInJetpack()

        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun StateInJetpack() {

   // var count by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick ={} ) {
            Text("Hello JetPack")
        }

        OutlinedButton(onClick = {}) {
            Text("Hello JetPack")
        }

        IconButton(onClick ={} ) {

            Icon(imageVector = Icons.Outlined.Person, contentDescription = "")
        }

        TextButton(onClick = {}

        ) {
            Icon(imageVector = Icons.Default.Add,"")
            Text("Add Fiture")
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))

                  }

        Button(onClick ={},
            border = BorderStroke(2.dp,Color.Red),
            elevation = ButtonDefaults.buttonElevation(10.dp, pressedElevation = 15.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color.White, contentColor = Color.Green),
            shape = RoundedCornerShape(50)
        ) {
            Text("Hello JetPack")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ShowMethod() {

    StateInJetpack()

}



