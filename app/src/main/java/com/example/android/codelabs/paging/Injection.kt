package com.example.android.codelabs.paging

import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.example.android.codelabs.paging.data.ArticleRepositoryImpl
import com.example.android.codelabs.paging.domain.GetPagingSourceUseCase
import com.example.android.codelabs.paging.presentation.ViewModelFactory

object Injection {

    val provideArticleRepository = ArticleRepositoryImpl()
    private fun provideGetPagingSourceUseCase()=GetPagingSourceUseCase(provideArticleRepository)

    fun provideViewModelFactory(
        owner: SavedStateRegistryOwner
    ): ViewModelProvider.Factory {
        return ViewModelFactory(owner,provideGetPagingSourceUseCase())
    }
}
