package com.surajvanshsv.courcesappcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun ConstraintLayoutScreen(){
    ConstraintLayout(
        modifier = Modifier.background(MaterialTheme.colorScheme.surface)
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {

        // create references
        val (gradientBackground,
            profileImg,notificationImg,
            welcomebacktext,questiontext,joinbtn,coursesimg,
            cards,
            newCourses,androidimg,javaimg,pythonimg,
            pythontext,javatext,androidtext
        ) = createRefs()  // ek refs me 16 references variable hi reh sakta hia to new banana padega uske baad

        val (latesttext,seealltext,
            lessoncard
        ) =createRefs()




        // guideline for image portion , neeche se half screen tak rehna hai iss image ko to 45% tak line bana denge
        val horizontalGuideLine1 = createGuidelineFromBottom(0.45f)

        BackgroundGradient(modifier = Modifier.constrainAs(gradientBackground){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(horizontalGuideLine1)
            width = Dimension.fillToConstraints
        })


        val topGuideLine = createGuidelineFromTop(82.dp)
        val startGuidLine = createGuidelineFromStart(16.dp)
        val endGuideLine = createGuidelineFromEnd(16.dp)


        createHorizontalChain(
            profileImg,notificationImg,
            chainStyle = ChainStyle.SpreadInside
        )

        ProfileImage(
            modifier = Modifier.constrainAs(profileImg){
                top.linkTo(topGuideLine)
            }
        )

        NotficationImage(
            modifier = Modifier.constrainAs(notificationImg){
                top.linkTo(profileImg.top)
                bottom.linkTo(profileImg.bottom)
            }
        )

        // the middle part
        WelcomeText(modifier = Modifier.constrainAs(welcomebacktext){
            top.linkTo(profileImg.bottom, margin = 16.dp)
            start.linkTo(profileImg.start, margin = 16.dp)

        })

        QuestionText(
            modifier = Modifier.constrainAs(questiontext){
                top.linkTo(welcomebacktext.bottom, margin = 2.dp)
                start.linkTo(welcomebacktext.start, margin = 2.dp)
            }
        )

        JoinNowButton(
            modifier = Modifier.constrainAs(joinbtn){
                top.linkTo(questiontext.bottom, margin = 12.dp)
                start.linkTo(questiontext.start, margin = 40.dp)
                end.linkTo(questiontext.end)
            }
        ) { }


        CourcesImage(
            modifier = Modifier.scale(1.2f).padding(bottom = 79.dp)
                .constrainAs(coursesimg){
                    top.linkTo(joinbtn.bottom, margin = (-18).dp)
                bottom.linkTo(horizontalGuideLine1)
                end.linkTo(endGuideLine)
                start.linkTo(joinbtn.end, margin = 2.dp)
                width = Dimension.value(500.dp)
                height = Dimension.fillToConstraints

            }
        )

         MyCard(
             modifier = Modifier.constrainAs(cards){
                 top.linkTo(horizontalGuideLine1, margin = (-102).dp)
                 end.linkTo(parent.end)
                 start.linkTo(parent.start)
                 bottom.linkTo(parent.bottom)
                 width = Dimension.fillToConstraints
                 height = Dimension.fillToConstraints
             }
         )


        TextOurCoursed(modifier = Modifier.constrainAs(newCourses){
            top.linkTo(cards.top, margin = 24.dp)
            start.linkTo(cards.start, margin = 16.dp)
        })


        AndroidCourseImg(
            modifier = Modifier.size(80.dp)
                .constrainAs(androidimg){
                top.linkTo(newCourses.bottom, margin = 16.dp)

            }
        )


        JavaCourseImg(
            modifier = Modifier.size(80.dp).scale(1.6f)
                .constrainAs(javaimg){
                top.linkTo(androidimg.top)
                bottom.linkTo(androidimg.bottom)
            }
        )

        PythonCourseImg(
            modifier = Modifier.size(80.dp)
                .constrainAs(pythonimg){
                top.linkTo(androidimg.top)
                bottom.linkTo(androidimg.bottom)
            }
        )

        createHorizontalChain(
            androidimg,javaimg,pythonimg,
            chainStyle = ChainStyle.Spread
        )


        AndroidText(modifier = Modifier.padding(end = 8.dp)
            .constrainAs(androidtext){
            top.linkTo(androidimg.bottom, margin = 12.dp)
            start.linkTo(androidimg.start)
            end.linkTo(androidimg.end)

        })

        JavaText(modifier = Modifier.constrainAs(javatext){
            top.linkTo(javaimg.bottom, margin = 12.dp)
            start.linkTo(javaimg.start)
            end.linkTo(javaimg.end)

        })


        PythonText(modifier = Modifier.padding(start = 8.dp).constrainAs(pythontext){
            top.linkTo(pythonimg.bottom, margin = 12.dp)
            start.linkTo(pythonimg.start)
            end.linkTo(pythonimg.end)
        })

        createHorizontalChain(
            androidtext,javatext,pythontext,
            chainStyle = ChainStyle.Spread
        )

        LatestLessonText(modifier = Modifier.constrainAs(latesttext){
            top.linkTo(pythontext.bottom, margin = 30.dp)
            start.linkTo(startGuidLine)
        })

        SeeAllText(
            modifier = Modifier.constrainAs(seealltext){
                top.linkTo(latesttext.top)
                end.linkTo(endGuideLine)
            }
        )

        LessonCard(modifier = Modifier.constrainAs(lessoncard){
            top.linkTo(latesttext.bottom, margin = 16.dp)
            start.linkTo(latesttext.start)
            end.linkTo(endGuideLine)
            width = Dimension.fillToConstraints
            height = Dimension.wrapContent
        })



    }// constraint layout out here
}



