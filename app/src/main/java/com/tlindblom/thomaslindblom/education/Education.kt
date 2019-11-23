package com.tlindblom.thomaslindblom.education

data class Education(val school: String, val major: String, val degree: Degree, val graduationYear: Int) {
    val courseList: MutableList<String> = mutableListOf()
}