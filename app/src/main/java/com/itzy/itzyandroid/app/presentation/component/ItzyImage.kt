package com.itzy.itzyandroid.app.presentation.component

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun ItzyImage(
    imageUrl: String = "https://yt3.ggpht.com/ytc/AMLnZu9OcYbmczVAQ8oR_3XIrm9JtKwoBjqwMwcR-i5b=s900-c-k-c0x00ffffff-no-rj",
    contentDescription: String = "",
    modifier: Modifier = Modifier,
    clip: Shape = CircleShape
){
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = modifier.clip(clip),
    )
}