package com.example.recentclaims

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.recentclaims.ui.RecentClaimItem
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * @author Nav Singh
 */
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
        composeTestRule.setContent {
            RecentClaimItem()
        }

        composeTestRule.onNodeWithText("RecentClaim").assertIsDisplayed()
    }
}
