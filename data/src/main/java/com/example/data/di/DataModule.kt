package com.example.data.di

import com.example.data.repository.RecentClaimRepository
import com.example.data.repository.RecentClaimsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Singleton
    @Binds
    abstract fun bindsRecentClaimsRepository(
        recentClaimRepository: RecentClaimsRepositoryImpl
    ): RecentClaimRepository
}
