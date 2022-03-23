package ru.gb;

import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ScreenShotHelper extends BaseTest {
    @Test
    public void createScreen() {
        openApp();
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
        // Загружаем актуальный скриншот.
        //BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());
    }

}
