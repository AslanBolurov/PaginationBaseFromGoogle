package com.example.android.codelabs.paging.domain

import com.example.android.codelabs.paging.data.ArticlePagingSource

class GetPagingSourceUseCase(
    private val repository: ArticleRepository
) {
    operator fun invoke(): ArticlePagingSource = repository.articlePagingSource()
}