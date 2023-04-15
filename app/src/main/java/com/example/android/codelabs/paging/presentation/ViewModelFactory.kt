package com.example.android.codelabs.paging.presentation

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.example.android.codelabs.paging.domain.GetPagingSourceUseCase

class ViewModelFactory(
    owner: SavedStateRegistryOwner,
    val provideGetPagingSourceUseCase: GetPagingSourceUseCase,
) : AbstractSavedStateViewModelFactory(owner, null) {

    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        if (modelClass.isAssignableFrom(ArticleViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ArticleViewModel(provideGetPagingSourceUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
