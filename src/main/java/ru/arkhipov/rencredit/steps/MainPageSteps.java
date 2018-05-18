package ru.arkhipov.rencredit.steps;



import io.qameta.allure.Step;
import ru.arkhipov.rencredit.pages.MainPage;


/**
 * Created by Maria on 29.04.2017.
 */
public class MainPageSteps {



    @Step("выбран калькулятор для вкладов")
    public void selectCalculator(){
        new MainPage().calculator.click();
    }



}
