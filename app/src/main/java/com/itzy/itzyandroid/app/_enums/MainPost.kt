package com.itzy.itzyandroid.app._enums

import androidx.annotation.DrawableRes
import com.itzy.itzyandroid.R

sealed class MainPost(val tag: String, val name: String, val image: Int) {
    object help : MainPost("help", "도움 게시판", R.drawable.help)
    object information : MainPost("information", "정보 게시판", R.drawable.info)
    object promotion : MainPost("promotion", "홍보 게시판", R.drawable.megaphone)
    object work : MainPost("work", "채용 게시판", R.drawable.work)
}
