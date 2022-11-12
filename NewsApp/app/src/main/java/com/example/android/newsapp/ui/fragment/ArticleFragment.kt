package com.example.android.newsapp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.android.newsapp.ui.MainActivity
import com.example.android.newsapp.R
import com.example.android.newsapp.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}