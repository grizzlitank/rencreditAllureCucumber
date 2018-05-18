package ru.arkhipov.rencredit.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.arkhipov.rencredit.steps.BaseSteps;

import java.util.List;



public class BasePageObject {



    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

    public void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элемент коллекции - " + itemName);
    }

    public void waiting(String xPath, String profit){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 15);
        wait.until(ExpectedConditions.textToBe(By.xpath(xPath),profit));
    }

}
