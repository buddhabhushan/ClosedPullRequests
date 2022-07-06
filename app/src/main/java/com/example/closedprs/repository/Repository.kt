package com.example.closedprs.repository

import com.example.closedprs.api.RetrofitInstance
import com.example.closedprs.model.PullRequest
import com.example.closedprs.util.Constants.Companion.STATE
import retrofit2.Response

class Repository {

    suspend fun getPullRequests(): Response<List<PullRequest>> {
        return RetrofitInstance.api.getPullRequests(STATE)
    }
}