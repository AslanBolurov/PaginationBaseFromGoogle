package com.example.android.codelabs.paging.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.android.codelabs.paging.data.Article
import com.example.android.codelabs.paging.data.ArticleRepositoryImpl
import com.example.android.codelabs.paging.domain.GetPagingSourceUseCase
import kotlinx.coroutines.flow.*

private const val ITEMS_PER_PAGE = 50

class ArticleViewModel(
    private val getPagingSourceUseCase:GetPagingSourceUseCase
) : ViewModel() {

    val items: Flow<PagingData<Article>> = Pager(
        config = PagingConfig(pageSize = ITEMS_PER_PAGE, enablePlaceholders = false),
        pagingSourceFactory = { getPagingSourceUseCase() }
    )
        .flow
        .cachedIn(viewModelScope)

}
