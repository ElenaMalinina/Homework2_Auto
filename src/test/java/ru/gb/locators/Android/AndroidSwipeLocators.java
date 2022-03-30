package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.SwipePageLocators;

public class AndroidSwipeLocators implements SwipePageLocators {
    @Override
    public By swipeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\\\"Swipe\\\"]/android.widget.TextView");
    }

    @Override
    public By swipePoint() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\\\"Carousel\\\"]/android.view.ViewGroup[2]/android.view.ViewGroup");
    }

}
