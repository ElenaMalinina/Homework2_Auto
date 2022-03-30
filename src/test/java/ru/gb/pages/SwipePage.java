package ru.gb.pages;

import io.qameta.allure.Step;
import ru.gb.locators.LocatorService;
import ru.gb.locators.interfaces.SwipePageLocators;

import static com.codeborne.selenide.Selenide.$;

public class SwipePage {
    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке 'swipe' в форме")
    public SwipePage clickSwipeButton() {
        $(locator().swipeButton()).click();
        return new SwipePage();
    }

    @Step("Проверяем возможность пролистать")
    public SwipePage checkSwipePage() {
        $(locator().swipePoint()).click();;
        return new SwipePage();
    }
}
