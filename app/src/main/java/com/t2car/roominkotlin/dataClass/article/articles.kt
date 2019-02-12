package com.t2car.roominkotlin.dataClass.article

data class articles(
        val articles: List<Article>,
        val status: String,
        val totalResults: Int
)