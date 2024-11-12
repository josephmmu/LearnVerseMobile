package com.example.learnversemobile.popups

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnversemobile.R


class AlertDialogue (
    val alertType: Int,
    val alertTitle: String,
    val alertContent: String
)

@Composable
fun AlertDialogue(
    alert: MutableState<AlertDialogue>,
    onDismiss:()-> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = { },
        modifier = Modifier
            .height(800.dp)
            .width(500.dp),

        title = {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = alert.value.alertType),
                    contentDescription = "Submit",
                    modifier = Modifier.size(24.dp)
                )

                Text(
                    text = alert.value.alertTitle ,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp, 0.dp)
                )
            }
        },
        text = {
             Column (
                 modifier = Modifier
                     .fillMaxSize(),
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center
             ){
                 Text(alert.value.alertContent)
             }
        }
    )

}