package com.example.closedprs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.closedprs.repository.Repository

class PullRequestViewModelFactory(
    private val repository: Repository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PullRequestViewModel(repository) as T
    }

}