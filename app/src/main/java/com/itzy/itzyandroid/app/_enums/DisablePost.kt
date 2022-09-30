package com.itzy.itzyandroid.app._enums

sealed class DisablePost(val tag: String, val name: String) {
    object Physical_disability : DisablePost("Physical_disability", "지체장애인 게시판")
    object Eye_disability : DisablePost("Eye_disability", "시각장애인 게시판")
    object Hear_disability : DisablePost("Hear_disability", "청각장애인 게시판")
    object Intelectual_disability : DisablePost("Intelectual_disability", "지적장애인 게시판")
    object Brain_disability : DisablePost("Brain_disability", "뇌병변장애인 게시판")
    object Speech_disability : DisablePost("Speech_disability", "언어-안면 장애인 게시판")
    object Mental_disability : DisablePost("Mental_disability", "정신-발달 장애인 게시판")
    object Organ_disability : DisablePost("Organ_disability", "내부기관 장애인 게시판")
    object non_disability  : DisablePost("non_disability ", "비장애인 게시판")
}

