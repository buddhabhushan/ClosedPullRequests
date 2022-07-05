package com.example.closedprs

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.closedprs.model.PullRequest
import com.example.closedprs.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class PullRequestViewModel(
    private val repository: Repository
): ViewModel() {

    val myResponse: MutableLiveData<Response<List<PullRequest>>> = MutableLiveData()

    fun getPullRequests() {
        viewModelScope.launch {
            val response = repository.getPullRequests()
            myResponse.value = response
        }
    }
}