package com.example.data.di

import com.example.data.apis.RecentClaimAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RecentClaimsAPIModule {

    @Singleton
    @Provides
    fun provideRecentClaimsAPI(
        // Potential dependencies of this type
    ): RecentClaimAPI {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(RecentClaimAPI::class.java)
    }
}
