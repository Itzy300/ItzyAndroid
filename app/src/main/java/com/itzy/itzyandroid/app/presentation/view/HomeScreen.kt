package com.itzy.itzyandroid.app.presentation.view

import androidx.annotation.DrawableRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.app._enums.DisablePost
import com.itzy.itzyandroid.app._enums.LocationPost
import com.itzy.itzyandroid.app._enums.MainPost
import com.itzy.itzyandroid.ui.theme.*

@Composable
fun HomeScreen(
    navController: NavController
){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(scrollState)
    ){
        topBar(
            modifier = Modifier
                .padding(13.dp, 11.dp)
                .fillMaxWidth()
        )
        Divider(color = Black, modifier = Modifier
            .fillMaxWidth()
            .shadow(8.dp), thickness = 0.5.dp)
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(20.dp, 30.dp)
        ){
            item {
                MainPost::class.sealedSubclasses.mapNotNull { it.objectInstance }.forEach {
                    Row {
                        MainPostItem(
                            resId = it.image,
                            title = it.name,
                            modifier = Modifier
                                .clip(shape = Shapes.small)
                                .background(MainBlue2)
                                .size(100.dp, 115.dp)
                                .border(0.5.dp, MainGray2, shape = Shapes.small)
                                .padding(top = 15.dp, bottom = 10.dp)
                        )
                        Spacer(modifier = Modifier.width(13.dp))
                    }
                }
            }
        }
        CategoryItem(modifier = Modifier, myType = 0)
        CategoryItem(modifier = Modifier, myType = 1)
    }
}

@Composable
fun topBar(
    modifier: Modifier = Modifier,
    searchClick: () -> Unit = {},
    profileClick: () -> Unit = {},
){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.itzy_character),
                contentDescription = "itzy character",
                modifier = Modifier
                    .padding(end = 5.dp)
                    .width(33.dp)
            )
            Text(
                text = "잇지",
                fontWeight = FontWeight.Bold,
                style = TextStyles.TextBasics1,
                color = MainBlue
            )
        }

        Row(
            horizontalArrangement = Arrangement.End
        ) {
            IconButton(
                onClick = searchClick,
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "search",
                    tint = Black,
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(
                onClick = profileClick,
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile",
                    tint = Black,
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}

@Composable
fun MainPostItem(
    modifier: Modifier = Modifier,
    @DrawableRes resId: Int = R.drawable.info,
    title: String = "게시판",
    onClick: () -> Unit = {}
){
    Column(
        modifier = modifier.clickable(onClick = onClick)
    ){
        Image(
            painter = painterResource(id = resId),
            contentDescription = title,
            modifier = Modifier
                .size(55.dp)
                .align(CenterHorizontally)
        )
        Text(
            text = title,
            color = Black,
            style = TextStyles.TextBasics3,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 15.dp)
                .align(CenterHorizontally)
        )
    }
}

@Composable
fun CategoryTitle(
    modifier: Modifier = Modifier,
    @DrawableRes resId: Int = R.drawable.info,
    title: String = "게시판",
){
  Row(
      modifier = modifier
  ) {
      Image(
          painter = painterResource(id = resId),
          contentDescription = title,
          modifier = Modifier
              .padding(end = 15.dp)
              .size(33.dp)
      )
      Text(
          text = title,
          style = TextStyles.TextBasics1,
          color = Black
      )
  }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryItem(
    modifier: Modifier = Modifier,
    myType: Int = 0
){
    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f
    )
    var title = listOf("장애 유형별 게시판", "지역별 게시판")
    var image = listOf(R.drawable.disable, R.drawable.location)

    Column(
        modifier = modifier.padding(20.dp, 10.dp).fillMaxWidth(),
    ) {
        CategoryTitle(
            modifier = Modifier.padding(bottom = 20.dp),
            resId = image[myType],
            title = title[myType]
        )
        Card(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            shape = Shapes.small,
            border = BorderStroke(0.5.dp, MainGray2),
            backgroundColor = MainBlue2
        ){
            Column {
                when(myType) {
                    0 -> DisablePost::class.sealedSubclasses.mapNotNull { it.objectInstance }
                        .subList(0, if (expandedState) DisablePost::class.sealedSubclasses.size else 3
                        ).forEach { DetailCategory(it.name) }

                    else -> LocationPost::class.sealedSubclasses.mapNotNull { it.objectInstance }
                        .subList(0, if (expandedState) LocationPost::class.sealedSubclasses.size else 3
                        ).forEach { DetailCategory(it.name) }
                }
                Row(
                    modifier = Modifier
                        .padding(vertical = 12.dp)
                        .fillMaxWidth()
                        .clickable { expandedState = !expandedState },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.plus_arrow),
                        contentDescription = "view more button",
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .size(15.dp)
                            .rotate(rotationState)
                    )
                    Text(
                        text = if (expandedState) "접기" else "더보기",
                        style = TextStyles.TextSmall1,
                        color = Black,
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun DetailCategory(
    text: String = "장애인 게시판",
    onClick: () -> Unit = {}
){
    Column(
        modifier = Modifier
            .padding(top = 18.dp, start = 15.dp, end = 15.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.bookmark),
                contentDescription = "bookmark image",
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(21.dp)
            )
            Text(
                text = text,
                style = TextStyles.TextBasics2,
                color = Black,
                modifier = Modifier.align(CenterVertically)
            )
        }
        Divider(modifier = Modifier
            .padding(top = 9.dp)
            .fillMaxWidth(), thickness = 0.5.dp, color = MainGray2)
    }
}