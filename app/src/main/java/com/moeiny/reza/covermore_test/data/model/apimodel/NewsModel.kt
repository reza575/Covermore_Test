package com.moeiny.reza.covermore_test.data.model.apimodel

data class NewsModel(
    val feed: Feed,
    val items: List<Item>,
    val status: String
)