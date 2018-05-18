package ru.arkhipov.rencredit.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.arkhipov.rencredit.steps.BaseSteps;

import java.util.List;



public class MainPage extends BasePageObject{


    @FindBy(xpath = "//div[contains (text(), 'Вклады')]/ancestor::div[@class='service']//span[contains (text(), 'Калькулятор')]")
    public WebElement calculator;






}


