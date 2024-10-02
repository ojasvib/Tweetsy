package com.ojasvi.tweetsy.api

import com.ojasvi.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("/v3/b/66eee224e41b4d34e4346d4a?meta=false")
    suspend fun getTweets(@Header("X-JSON-PATH") category: String): Response<List<TweetListItem>>

    @GET("/v3/b/66eee224e41b4d34e4346d4a?meta=false")
    @Headers("X-json-path: $..category")
    suspend fun getCategories(): Response<List<String>>
}