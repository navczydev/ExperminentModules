package com.example.recentclaims.ui

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RecentClaimItemKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()
    // use createAndroidComposeRule<YourActivity>() if you need access to
    // an activity

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun recentClaimItem() {
        // Start the app
        composeTestRule.setContent {
            RecentClaimItem()
        }

        composeTestRule.onNodeWithText("RecentClaim").assertIsDisplayed()

    }
}