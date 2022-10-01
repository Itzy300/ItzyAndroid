package com.itzy.itzyandroid.app._enums

sealed class LocationPost(val tag: String, val name: String) {
    object Seoul : LocationPost("Seoul", "서울ㆍ인천ㆍ경기 게시판")
    object Busan: LocationPost("Busan", "부산ㆍ울산ㆍ경남 게시판")
    object Daegu : LocationPost("Daegu", "대구ㆍ경북 게시판")
    object Chungbuk : LocationPost("Chungbuk", "충북 게시판")
    object Gangwon : LocationPost("Gangwon", "강원 게시판")
    object Chungnam : LocationPost("Chungnam", "충남 게시판")
    object Jeonbuk  : LocationPost("Jeonbuk", "전북 게시판")
    object Gwangju : LocationPost("Gwangju", "광주ㆍ전남 게시판")
    object Jeju : LocationPost("Jeju", "제주 게시판")
}

