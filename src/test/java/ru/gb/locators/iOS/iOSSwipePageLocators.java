package ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.SwipePageLocators;

public class iOSSwipePageLocators implements SwipePageLocators {

    public By swipeButton() {
        return MobileBy.AccessibilityId("button-SWIPE");
    }

    public By swipePoint() {
        return null;
    }
}
