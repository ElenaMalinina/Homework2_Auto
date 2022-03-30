package ru.gb.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)

public class ScreenShotTest extends BaseTest {
    @Test
    public void checkMainPageScreen() {
        openApp()
                .checkScreenshot();

    }
}
