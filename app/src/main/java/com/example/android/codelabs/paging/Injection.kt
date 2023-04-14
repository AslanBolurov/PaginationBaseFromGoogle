package com.example.android.codelabs.paging

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.example.android.codelabs.paging.data.ArticleRepository
import com.example.android.codelabs.paging.ui.ViewModelFactory

object Injection {

    private fun provideArticleRepository(): ArticleRepository =
        ArticleRepository()

    fun provideViewModelFactory(
        owner: SavedStateRegistryOwner
    ): ViewModelProvider.Factory {
        return ViewModelFactory(owner, provideArticleRepository())
    }
}
