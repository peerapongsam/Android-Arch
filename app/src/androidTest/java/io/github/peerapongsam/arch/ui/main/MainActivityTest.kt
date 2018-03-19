package io.github.peerapongsam.arch.ui.main

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import io.github.peerapongsam.arch.R
import org.hamcrest.CoreMatchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @JvmField
    @Rule
    val activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java, false, true)

    @Test
    fun on_start_avatar_should_invisible() {
        onView(withId(R.id.avatar_image))
                .check(matches(not(isDisplayed())))
        onView(withId(R.id.search_text))
                .check(matches(withText("")))
    }
}