package ru.gb.tests;


import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckCarouselTest extends BaseTest {

    @Test
    @Description("Проверим работу карусели")
    public void CheckSecondPoint() {
        openApp()
                .clickSwipeButton();


    }


}
