package com.example.android.codelabs.paging.domain

import com.example.android.codelabs.paging.data.ArticlePagingSource

interface ArticleRepository{
    fun articlePagingSource(): ArticlePagingSource
}