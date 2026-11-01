package com.netology.tabbedapplication;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testTabSwitching() {
        // 1. Проверяем, что изначально активна вкладка "TAB 1" с надписью "Page: 1"
        Espresso.onView(ViewMatchers.withText("Page: 1"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // 2. Нажимаем на вкладку "TAB 2"
        Espresso.onView(ViewMatchers.withText("TAB 2"))
                .perform(ViewActions.click());

        // 3. Проверяем, что открылся экран с надписью "Page: 2"
        Espresso.onView(ViewMatchers.withText("Page: 2"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
