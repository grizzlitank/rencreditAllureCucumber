package ru.arkhipov.rencredit.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by m.baykova on 13.09.2017.
 */
public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    CalculatorSteps calculatorSteps = new CalculatorSteps();




    @When("^выбран калькулятор для вкладов$")
    public void selectCalculatorStep(){
        mainPageSteps.selectCalculator();
    }

    @Then("^заголовок соответствует \"(.+)\"$")
    public void checkTitleStep(String title){

        calculatorSteps.checkTitle(title);
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> calculatorSteps.fillField(field, value));

    }

    @Then("^поля имеют значения:$")
    public void checkForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> calculatorSteps.checkField(field, value));

    }




}
