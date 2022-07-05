package com.example.closedprs.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.closedprs.model.PullRequest

@Composable
fun PullRequestsUI(
    pullRequests: List<PullRequest>?,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        pullRequests?.forEach { pullRequest ->
            PullRequest(
                imgUrl = pullRequest.creator.imageUrl,
                title = pullRequest.title,
                userName = pullRequest.userName,
                createdDate = pullRequest.createdAt,
                closedDate = pullRequest.closedAt,
            )
        }
    }

}

@Composable
fun PullRequest(
    imgUrl: String,
    title: String,
    userName: String,
    createdDate: String,
    closedDate: String,
) {
    Card {
        Row {
            Column {
                Text(
                    text = title,
                    style = TextStyle.Default,
                    color = Color.Blue,
                )
                Spacer(Modifier.size(8.dp))
                Text(
                    text = userName,
                    style = TextStyle.Default,
                    color = Color.Blue,
                )
                Spacer(Modifier.size(8.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = createdDate,
                        style = TextStyle.Default,
                        color = Color.Blue,
                    )
                    Spacer(Modifier.size(8.dp))
                    Text(
                        text = closedDate,
                        style = TextStyle.Default,
                        color = Color.Blue,
                    )
                    Spacer(Modifier.size(8.dp))
                }
            }
        }
    }
}
