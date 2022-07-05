package com.example.closedprs.api

import com.example.closedprs.model.PullRequest
import retrofit2.Response
import retrofit2.http.GET

interface GithubService {

    @GET("")
    fun getPullRequests() : Response<List<PullRequest>>
}