package ru.gb.tests;//package ru.gb.tests;
//
//import jdk.jfr.Description;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//import ru.gb.base.BaseTest;
//import ru.gb.listeners.AllureListener;
//
//import static ru.gb.tests.CheckErrorTextTest.VALID_EMAIL_ADDRESS;
//
//@Listeners(AllureListener.class)
//public class CheckFailErrorTextTest extends BaseTest {
//    @Test
//    @Description("Проверяем поведения теста при падение проверки сообщения об ошибке валидного email")
//    public void CheckFailEmptyEmail() {
//        openApp()
//                .clickLoginMenuButton()
//                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
//    }
//
//}
