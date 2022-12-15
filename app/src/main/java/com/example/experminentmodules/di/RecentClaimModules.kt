//package com.example.experminentmodules.di
//
//import com.example.recentclaims.data.RecentClaimAPI
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ActivityComponent
//import retrofit2.Retrofit
//
//@Module
//@InstallIn(ActivityComponent::class)
//object AnalyticsModule {
//
//    @Provides
//    fun provideAnalyticsService(
//        // Potential dependencies of this type
//    ): RecentClaimAPI {
//        return Retrofit.Builder()
//            .baseUrl("https://example.com")
//            .build()
//            .create(RecentClaimAPI::class.java)
//    }
//}