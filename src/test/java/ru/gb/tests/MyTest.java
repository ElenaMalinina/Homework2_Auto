package ru.gb.tests;

//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.net.URL;
//
//public class MyTest {
//    @Test
//    public void checkEmptyEmail() throws Exception {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel");
//        capabilities.setCapability("platformVersion", "10");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UiAutomator2");
//        capabilities.setCapability("app", "C:/Users/Midas/Downloads/Android-NativeDemoApp-0.2.1.apk");
//
//        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        Thread.sleep(2000);
//        MobileElement loginMenuButton = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView");
//
//        loginMenuButton.click();
//        Thread.sleep(2000);
//        MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
//        loginButton.click();
//        Thread.sleep(2000);
//        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
//        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");
//
//    }
//    @Test
//    public void checkSignUp() throws Exception {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Pixel");
//        capabilities.setCapability("platformVersion", "10");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UiAutomator2");
//        capabilities.setCapability("app", "C:/Users/Midas/Downloads/Android-NativeDemoApp-0.2.1.apk");
//
//        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        Thread.sleep(2000);
//        MobileElement loginMenuButton = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView");
//
//        loginMenuButton.click();
//        Thread.sleep(2000);
//        MobileElement signUp = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
//        signUp.click();
//        MobileElement emailField = (MobileElement) driver.findElementByAccessibilityId("input-email");
//        emailField.click();
//        emailField.sendKeys("test@gb.ru");
//        MobileElement passwordField = (MobileElement) driver.findElementByAccessibilityId("input-password");
//        passwordField.click();
//        passwordField.sendKeys("12345678");
//        MobileElement passwordRepeatField = (MobileElement) driver.findElementByAccessibilityId("input-repeat-password");
//        passwordRepeatField.click();
//        passwordRepeatField.sendKeys("12345678");
//        MobileElement checkIt = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
//        checkIt.click();
//        Thread.sleep(2000);
//        MobileElement signUpButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup");
//        signUpButton.click();
//
//
//    }
//}
