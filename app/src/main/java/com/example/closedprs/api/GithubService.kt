package com.example.closedprs.api

import com.example.closedprs.model.PullRequest
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    @GET("buddhabhushan/ClosedPullRequests/pulls")
    suspend fun getPullRequests(@Query(value = "state") state: String) : Response<List<PullRequest>>
}