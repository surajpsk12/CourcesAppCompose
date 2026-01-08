package com.surajvanshsv.courcesappcompose

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun BackgroundGradient(modifier: Modifier){
    Image(painter = painterResource(R.drawable.bluebackpic02),
        contentDescription = "Main Screen",
        contentScale = ContentScale.FillBounds,
        modifier = modifier.alpha(0.9f))
}