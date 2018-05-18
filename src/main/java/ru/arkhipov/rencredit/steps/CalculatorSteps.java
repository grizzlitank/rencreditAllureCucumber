package ru.arkhipov.rencredit.steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import ru.arkhipov.rencredit.pages.CalculatorPage;
import ru.arkhipov.rencredit.pages.MainPage;

public class CalculatorSteps {

    @Step("заголовок соответствует {title}")
    public void checkTitle(String title){

        Assert.assertEquals("Заголовок соответствует ожидаемому", title, new CalculatorPage().title.getText());
    }

    @Step("поле {field} заполняется значением {value}")
    public void fillField(String field, String value) {
        new CalculatorPage().fillField(field, value);
    }

    @Step("поле {field} имеет значение {value}")
    public void checkField(String field, String value) {
        new CalculatorPage().checkField(field, value);
    }
}
