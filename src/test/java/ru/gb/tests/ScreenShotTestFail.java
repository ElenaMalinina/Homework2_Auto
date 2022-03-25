package ru.gb.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)

public class ScreenShotTestFail extends BaseTest {
    @Test
    public void checkMainPageScreen() {
        openApp("pixel 10")
                .checkFailScreenshot();

    }
}