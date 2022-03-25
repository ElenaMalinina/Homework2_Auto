package ru.gb;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
@Listeners(AllureListener.class)

public class ScreenShotHelper extends BaseTest {
    @Test
    public void createScreen() {
        openApp("pixel 10");
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
        // Загружаем актуальный скриншот.
        //BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());
    }

}
