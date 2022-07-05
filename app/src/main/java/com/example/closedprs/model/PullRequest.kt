package com.example.closedprs.model

class PullRequestResponse(
    val pullRequests: List<PullRequest>
)

class PullRequest (
    val title: String,
    val userName: String,
    val createdAt: String,
    val closedAt: String,
    val creator: Creator,
)

class Creator (
    val imageUrl: String,
)