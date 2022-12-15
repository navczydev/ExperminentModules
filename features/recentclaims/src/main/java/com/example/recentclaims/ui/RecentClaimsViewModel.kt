package com.example.recentclaims.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.models.RecentClaimItem
import com.example.data.repository.RecentClaimRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * @author Nav Singh
 */
@HiltViewModel
class RecentClaimsViewModel @Inject constructor(private val recentClaimsRepository: RecentClaimRepository) :
    ViewModel() {

    private var _recentClaim: MutableStateFlow<RecentClaimItem> = MutableStateFlow(RecentClaimItem("", 0.0))
    val recentClaimItem: StateFlow<RecentClaimItem> get() = _recentClaim

    init {
        Log.d("RecentClaimsViewModel", "RecentClaimsViewModel:")
    }

    fun getRecentClaimById(claimId: Int) {
        viewModelScope.launch {
            recentClaimsRepository.getClaimById(claimId).collect {
                _recentClaim.value = it
            }
        }
    }

    fun getRecentClaims() {
        viewModelScope.launch {
            recentClaimsRepository.getClaims()
        }
    }
}
