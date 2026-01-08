package com.surajvanshsv.courcesappcompose

import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeText(modifier: Modifier){
    Text(
        text = "Welcome Back!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = modifier
    )
}


@Composable
fun QuestionText(modifier: Modifier){
    Text(text = "What do you want to learn?",
        color = Color.White,
        modifier = modifier)
}


@Composable
fun JoinNowButton(modifier: Modifier,onClick:()-> Unit){
    Button(
        onClick = {onClick()},
        modifier = modifier
    ){
        Text(
            "Join Now!"
        )
    }
}


@Composable
fun CourcesImage(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.cources2img3),
        contentDescription = "Courses",
        modifier = modifier
    )
}