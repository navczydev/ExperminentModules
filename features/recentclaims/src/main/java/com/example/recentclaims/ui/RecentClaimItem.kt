package com.example.recentclaims.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data.models.RecentClaimItem

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun RecentClaimRoute(recentClaimsViewModel: RecentClaimsViewModel = viewModel()) {
    LaunchedEffect(true) {
        recentClaimsViewModel.getRecentClaimById(1)
    }
    val recentClaim: RecentClaimItem? by recentClaimsViewModel.recentClaimItem.collectAsStateWithLifecycle()
    RecentClaimItem(recentClaimItem = recentClaim)
}

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun RecentClaimItem(recentClaimItem: RecentClaimItem?) {
    recentClaimItem?.let { nonNullableClaimItem ->
        Card {
            Row(Modifier.padding(16.dp)) {
                Text(nonNullableClaimItem.title)
                Spacer(modifier = Modifier.width(20.dp))
                Text("${nonNullableClaimItem.amount}")
            }
        }
    } ?: run {
        Text(text = "No data found")
    }
}

@Preview
@Composable
fun PreviewRecentClaimItem() {
    MaterialTheme {
        RecentClaimItem(RecentClaimItem("MassageTherapist", 54.56))
    }
}

@Preview
@Composable
fun PreviewRecentClaimItemNull() {
    MaterialTheme {
        RecentClaimItem(null)
    }
}
