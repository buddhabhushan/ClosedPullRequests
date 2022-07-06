package com.example.closedprs.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ErrorUI() {
    Column {
        Spacer(modifier = Modifier.size(18.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .padding(8.dp),
            text = "Please Try again later",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
        )
    }
}