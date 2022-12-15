package com.example.data.repository

import com.example.data.models.RecentClaimItem
import kotlinx.coroutines.flow.Flow

interface RecentClaimRepository {

    fun getClaims(): Flow<RecentClaimItem>

    fun getClaimById(clamId: Int): Flow<RecentClaimItem>
}
