package com.example.data.apis

interface RecentClaimAPI {

    fun fetchAllClaims()

    fun fetchClaimById(claimId: Int)
}
