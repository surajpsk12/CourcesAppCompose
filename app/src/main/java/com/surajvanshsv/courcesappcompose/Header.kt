package com.surajvanshsv.courcesappcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfileImage(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.profileimage),
        contentDescription = "Profile Image",
        modifier = modifier.padding(start = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
    )
}

@Composable
fun NotficationImage(modifier: Modifier){
    Image(
        painter = painterResource(R.drawable.bellicon2),
        contentDescription = "Notification",
        modifier = modifier.padding(end = 16.dp)
            .clip(CircleShape)
            .size(42.dp)
            .scale(1.5f)

    )
}