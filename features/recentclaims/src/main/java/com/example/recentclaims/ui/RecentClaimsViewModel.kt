package com.example.recentclaims.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.models.RecentClaimItem
import com.example.recentclaims.data.RecentClaimsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * @author Nav Singh
 */
class RecentClaimsViewModel(private val recentClaimsRepository: RecentClaimsRepository) : ViewModel() {

    private var _recentClaim: MutableStateFlow<RecentClaimItem?> = MutableStateFlow(null)
    val recentClaimItem: StateFlow<RecentClaimItem?> get() = _recentClaim

    fun getRecentClaimById(claimId: Int) {
        viewModelScope.launch {
            recentClaimsRepository.getRecentClaimDetails(1)
        }
    }
}
