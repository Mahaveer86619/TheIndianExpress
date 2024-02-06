package com.se7en.theindianexpress.data.remote.model

data class NewsArticles(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)