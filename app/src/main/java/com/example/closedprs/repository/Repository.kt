package com.example.closedprs.repository

import com.example.closedprs.api.RetrofitInstance
import com.example.closedprs.model.PullRequest
import retrofit2.Response

class Repository {

    suspend fun getPullRequests(): Response<List<PullRequest>> {
        return RetrofitInstance.api.getPullRequests()
    }
}