package com.example.closedprs.model

data class PullRequest(
    val closed_at: String,
    val created_at: String,
    val closed_by: ClosedBy?,
    val title: String,
)

data class ClosedBy(
    val avatar_url: String?,
    val login: String?,
)