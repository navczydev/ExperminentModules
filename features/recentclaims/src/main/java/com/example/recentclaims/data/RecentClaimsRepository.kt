package com.example.recentclaims.data

import com.example.data.models.RecentClaimDataItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class RecentClaimsRepository(private val recentClaimAPI: RecentClaimAPI) {

    suspend fun getRecentClaims(pageNum: Int): List<RecentClaimDataItem> =
        withContext(Dispatchers.IO) {
            delay(2000)
            // todo call api
            listOf(RecentClaimDataItem(claimName = "XYZ"))
        }

    suspend fun getRecentClaimDetails(claimId: Int): RecentClaimDataItem = withContext(Dispatchers.IO) {
        delay(2000)
        RecentClaimDataItem(claimName = "XYZ")
    }
}
