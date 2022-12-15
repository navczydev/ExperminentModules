package com.example.data.repository

import android.util.Log
import com.example.data.apis.RecentClaimAPI
import com.example.data.models.RecentClaimItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class RecentClaimsRepositoryImpl @Inject constructor(val recentClaimAPI: RecentClaimAPI) :
    RecentClaimRepository {

    override fun getClaims(): Flow<RecentClaimItem> {
        // TODO call api to fetch data
        Log.d("TAG", "getClaims: ")
        return flowOf(RecentClaimItem("", 5.4))
    }

    override fun getClaimById(clamId: Int): Flow<RecentClaimItem> {
        // TODO call api to fetch data
        Log.d("TAG", "getClaimById: ")
        return flowOf(RecentClaimItem("", 5.6))
    }
}
