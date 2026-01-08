package com.surajvanshsv.courcesappcompose

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextOurCoursed(modifier: Modifier){
    Text(text = "New Courses",
        modifier = modifier,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}

@Composable
fun AndroidCourseImg(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.android_logo),
        contentDescription = "android image",
        modifier = modifier
    )
}


@Composable
fun JavaCourseImg(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.javalogo),
        contentDescription = "java image",
        modifier = modifier
    )
}


@Composable
fun PythonCourseImg(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.pythonlogo),
        contentDescription = "python image",
        modifier = modifier
    )
}

@Composable
fun AndroidText(modifier: Modifier){
    Text(
        text = "Android",
        modifier = modifier,
        fontSize = 18.sp,
        color = Color.Black
    )
}

@Composable
fun JavaText(modifier: Modifier){
    Text(
        text = "Java",
        modifier = modifier,
        fontSize = 18.sp,
        color = Color.Black
    )

}

@Composable
fun PythonText(modifier: Modifier){
    Text(
        text = "Python",
        modifier = modifier,
        fontSize = 18.sp,
        color = Color.Black )
}