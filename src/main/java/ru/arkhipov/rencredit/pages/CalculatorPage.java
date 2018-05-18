package ru.arkhipov.rencredit.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.arkhipov.rencredit.steps.BaseSteps;

import java.util.concurrent.TimeUnit;

public class CalculatorPage extends BasePageObject{

    @FindBy(xpath = "//h2[@class='calculator-block__title block-title']")
    public WebElement title;

    @FindBy(xpath = "//div[@class='calculator__currency-content']")
    public WebElement currencyBtn;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement inputAmount;

    @FindBy(xpath = ".//div[@id='period-styler']")
    public WebElement period;

    @FindBy(xpath = ".//li[text()='9 месяцев']")
    public WebElement period1;

    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement inputReplenish;

    @FindBy(xpath = "//span[text()='Ежемесячная капитализация']")
    WebElement checkBox1;

    @FindBy(xpath = "//span[text()='Частичное снятие']")
    WebElement checkBox2;

    @FindBy(xpath = ".//span[@class='js-calc-rate']")
    WebElement calcRate;

    @FindBy(xpath = ".//span[@class='js-calc-earned']")
    WebElement calcEarned;

    @FindBy(xpath = ".//span[@class='js-calc-replenish']")
    WebElement calcReplenish;

    @FindBy(xpath = ".//span[@class='js-calc-result']")
    WebElement calcResult;

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Валюта":
                currencyBtn.findElement(By.xpath(".//span[text()='" + value + "']")).click();
                break;
            case  "Сумма вклада":
                fillField(inputAmount, value);
                break;
            case  "Срок":
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                period.click();

                waiting(BaseSteps.getDriver().findElement(By.xpath(".//li[text()='" + value + "']")));
                BaseSteps.getDriver().findElement(By.xpath(".//li[text()='" + value + "']")).click();
                break;
            case  "Пополнение":
                fillField(inputReplenish, value);
                break;
            case  "Чекбоксы":
                if(value.equals("1")){
                    checkBox1.click();
                }
                if(value.equals("2")) {
                    checkBox1.click();
                    checkBox2.click();
                }

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }

    public void checkField(String fieldName, String value){
        switch (fieldName){
            case  "Ставка":
                Assert.assertEquals("Поле верно", value, calcRate.getText());
                break;
            case  "Начислено":
                Assert.assertEquals("Поле верно", value, calcEarned.getText());
                break;
            case  "Пополнение":
                Assert.assertEquals("Поле верно", value, calcReplenish.getText());
                break;
            case  "К снятию":
                Assert.assertEquals("Поле верно", value, calcResult.getText());
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }


}
