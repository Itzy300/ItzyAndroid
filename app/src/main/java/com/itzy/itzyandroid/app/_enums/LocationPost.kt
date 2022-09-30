package com.itzy.itzyandroid.app._enums

sealed class LocationPost(val tag: String, val name: String) {
    object Seoul : LocationPost("Seoul", "서울인천경기")
    object Busan: LocationPost("Busan", "부산울산경남")
    object Daegu : LocationPost("Daegu", "대구경북")
    object Chungbuk : LocationPost("Chungbuk", "충북")
    object Gangwon : LocationPost("Gangwon", "강원")
    object Chungnam : LocationPost("Chungnam", "충남")
    object Jeonbuk  : LocationPost("Jeonbuk", "전북")
    object Gwangju : LocationPost("Gwangju", "광주전남")
    object Jeju : LocationPost("Jeju", "제주")
}

