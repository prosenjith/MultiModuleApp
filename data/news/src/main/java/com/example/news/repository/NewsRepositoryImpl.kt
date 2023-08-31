package com.example.news.repository

import com.example.news.datasource.remote.NewsRemoteDataSource
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    val remoteDataSource: NewsRemoteDataSource
) : NewsRepository {
    override fun fetchNews() {

    }
}