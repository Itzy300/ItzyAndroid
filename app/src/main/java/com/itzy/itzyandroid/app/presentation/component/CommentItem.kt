package com.itzy.itzyandroid.app.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import com.itzy.itzyandroid.ui.theme.MainGray2
import com.itzy.itzyandroid.ui.theme.MainGray3
import com.itzy.itzyandroid.ui.theme.TextStyles.TextSmall1
import com.itzy.itzyandroid.ui.theme.TextStyles.TextSmall2

@Composable
fun CommentItem(
    modifier: Modifier = Modifier,
    nickname: String = "댓글 작성자",
    content: String = "댓글내용 댓글내용 댓글내용 댓글내용 댓글내용 댓글내용 댓글내용 댓글내용 댓글내용 ..."
){
    Column(
        modifier = modifier
    ) {
        Row{
            ItzyImage(modifier = Modifier.padding(bottom = 7.dp).size(33.dp))
            Text(
                text = nickname,
                style = TextSmall1,
                color = MainGray3,
                fontWeight = Bold,
                modifier = Modifier.align(CenterVertically).padding(start = 10.dp)
            )
        }
        Text(
            text = content,
            style = TextSmall2,
            color = MainGray3
        )
        Divider(
            modifier = Modifier.padding(vertical = 10.dp).height(0.5.dp),
            color = MainGray2,
        )
    }
}