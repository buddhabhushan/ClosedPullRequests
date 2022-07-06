package com.example.closedprs.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.closedprs.PullRequestViewModel
import com.example.closedprs.util.DateConverter

@Composable
fun PullRequestsUI(
    viewModel: PullRequestViewModel,
) {
    val pullRequests = viewModel.myResponse.observeAsState().value

    if(pullRequests != null) {
        LazyColumn {
            itemsIndexed(pullRequests) { _, pullRequest ->
                PullRequest(
                    imgUrl = pullRequest.merged_by?.avatar_url ?: "",
                    title = pullRequest.title,
                    userName = pullRequest.merged_by?.login ?: "",
                    createdDate = DateConverter.convertDate(pullRequest.created_at),
                    closedDate = DateConverter.convertDate(pullRequest.closed_at),
                )
            }
        }
    }
}

@Composable
fun PullRequest(
    imgUrl: String? = "https://avatars.githubusercontent.com/u/35566875?v=4" ,
    title: String,
    userName: String,
    createdDate: String,
    closedDate: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        contentColor = Color.Gray,
        backgroundColor = Color.Yellow,
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = rememberAsyncImagePainter(imgUrl),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, color = Color.Red, shape = CircleShape),
            )
            Spacer(Modifier.size(8.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = title,
                    style = TextStyle.Default.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    ),
                    color = Color.Blue,
                )
                Spacer(Modifier.size(8.dp))
                if(userName != "") {
                    Text(
                        text = userName,
                        style = TextStyle.Default.copy(
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                        ),
                        color = Color.Blue,
                    )
                    Spacer(Modifier.size(8.dp))
                }
                Text(
                    text = "Created At: $createdDate",
                    style = TextStyle.Default,
                    color = Color.Blue,
                )
                Spacer(Modifier.size(8.dp))
                Text(
                    text = "Closed At: $closedDate",
                    style = TextStyle.Default,
                    color = Color.Blue,
                )

            }
        }
    }
}
