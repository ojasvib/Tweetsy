package com.ojasvi.tweetsy.repository

import com.ojasvi.tweetsy.api.TweetsyAPI
import com.ojasvi.tweetsy.models.TweetListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetRepository @Inject constructor(private val tweetsyAPI: TweetsyAPI) {

    private val _categories = MutableStateFlow<List<String>>(emptyList())
    val categories: StateFlow<List<String>> = _categories

    private val _tweets = MutableStateFlow<List<TweetListItem>>(emptyList())
    val tweets: StateFlow<List<TweetListItem>> = _tweets

    suspend fun getCategories(){
        val response = tweetsyAPI.getCategories()
        if(response.isSuccessful && response.body()!=null){
            _categories.emit(response.body()!!)
        }
    }


    suspend fun getTweets(category: String){
        val response = tweetsyAPI.getTweets("$[?(@.category == '$category')]")
        if(response.isSuccessful && response.body()!=null){
            _tweets.emit(response.body()!!)
        }
    }


}