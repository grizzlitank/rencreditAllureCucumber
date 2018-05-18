package ru.arkhipov.rencredit.steps;



import io.qameta.allure.Step;
import ru.arkhipov.rencredit.pages.MainPage;



public class MainPageSteps {



    @Step("выбран калькулятор для вкладов")
    public void selectCalculator(){
        new MainPage().calculator.click();
    }



}
