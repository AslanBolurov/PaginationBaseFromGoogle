package com.example.android.codelabs.paging.data

import com.example.android.codelabs.paging.domain.ArticleRepository

class ArticleRepositoryImpl: ArticleRepository {

    override fun articlePagingSource() = ArticlePagingSource()
}
