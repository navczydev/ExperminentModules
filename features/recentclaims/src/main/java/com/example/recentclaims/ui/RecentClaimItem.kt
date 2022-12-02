package com.example.recentclaims.ui

import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recentclaims.R

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun RecentClaimItem() {
    val recentClaimsViewModel = viewModel<RecentClaimsViewModel>()
    val claim = recentClaimsViewModel.recentClaimItem.collectAsStateWithLifecycle()
    Card {
        Text(stringResource(R.string.recentclaim))
    }
}

@Preview
@Composable
fun PreviewRecentClaimItem() {
    MaterialTheme {
        RecentClaimItem()
    }
}
