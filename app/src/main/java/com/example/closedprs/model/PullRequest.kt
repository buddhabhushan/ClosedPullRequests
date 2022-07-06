package com.example.closedprs.model

data class PullRequest(
    val closed_at: String,
    val created_at: String,
    val merged_by: MergedBy?,
    val title: String,
)

data class MergedBy(
    val avatar_url: String?,
    val login: String?,
)