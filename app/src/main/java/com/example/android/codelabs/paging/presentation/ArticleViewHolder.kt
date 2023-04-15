package com.example.android.codelabs.paging.presentation

import androidx.recyclerview.widget.RecyclerView
import com.example.android.codelabs.paging.data.Article
import com.example.android.codelabs.paging.data.createdText
import com.example.android.codelabs.paging.databinding.ArticleViewholderBinding

class ArticleViewHolder(
    private val binding: ArticleViewholderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(article: Article) {
        binding.apply {
            title.text = article.title
            description.text = article.description
            created.text = article.createdText
        }
    }
}
