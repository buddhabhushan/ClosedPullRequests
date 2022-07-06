package com.example.closedprs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.closedprs.repository.Repository
import com.example.closedprs.ui.PullRequestsUI
import com.example.closedprs.ui.theme.ClosedPRsTheme
import kotlinx.coroutines.delay
import okhttp3.internal.wait

// Adding new lines just to increase the number of cards

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository = Repository()
        val viewModelFactory = PullRequestViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, viewModelFactory)[PullRequestViewModel::class.java]
        val response = viewModel.getPullRequests()

        println("TESTING:  " + viewModel.myResponse.value.toString())


        setContent {
            ClosedPRsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PullRequestsUI(viewModel)
                }
            }
        }
    }
}
