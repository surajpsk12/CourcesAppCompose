package com.surajvanshsv.courcesappcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun  LatestLessonText(modifier: Modifier){
    Text(
        text = "Latest Lessons",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier,
        color = Color.Black
    )
}


@Composable
fun SeeAllText(modifier: Modifier){
    Text(
        text = "See All",
        fontSize = 20.sp,
        color = Color.Blue,
        modifier = modifier
    )
}



@Composable
fun LessonCard(modifier: Modifier){
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .wrapContentSize(Alignment.TopStart)
                .fillMaxHeight()
                .background(Color.White)
        ) {
            Spacer(modifier = Modifier.width(8.dp))

            ConstraintLayout(modifier= Modifier.fillMaxSize()) {

                val (lessondate
                    , timelogo,
                    lessontimetext , lessonimg , lessontitle , lessondescription
                ) = createRefs()

                Text(
                    text = "Lesson Date",
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessondate){
                        top.linkTo(parent.top,16.dp)
                        start.linkTo(parent.start,24.dp)
                    }
                )


                Image(
                    painter = painterResource(R.drawable.timelogo),
                    contentDescription = "time",
                    modifier = Modifier.size(28.dp)
                        .constrainAs(timelogo){
                        top.linkTo(lessondate.bottom,8.dp)
                        start.linkTo(lessondate.start)
                    }
                )

                Text(text = "Thur 8 Jan | 08:00 - 08:30 AM",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.constrainAs(lessontimetext){
                        top.linkTo(lessondate.bottom,8.dp)
                        start.linkTo(timelogo.end,4.dp)

                    })

                Image(painter = painterResource(R.drawable.dsaimage),
                    contentDescription = "dsa",
                    modifier = Modifier.size(70.dp).padding(bottom = 6.dp)
                        .constrainAs(lessonimg){
                            top.linkTo(timelogo.bottom,8.dp)
                            start.linkTo(timelogo.start)
                            bottom.linkTo(parent.bottom, margin = 14.dp)

                        })

                Text(
                    text = "Data Structures & Algorithms",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(lessontitle){
                        top.linkTo(lessonimg.top)
                        start.linkTo(lessonimg.end,8.dp)

                    }
                )

                Text(
                    text = "To be a pro developer , you need to master data structures and algorithms",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessondescription) {
                        top.linkTo(lessontitle.bottom, 8.dp)
                        start.linkTo(lessontitle.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints

                    })

            }


        }
    }
}