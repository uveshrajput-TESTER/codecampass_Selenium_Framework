package in.codecompass.Base;

import in.codecompass.Driver.DriverManager;
import in.codecompass.Utils.PropertiesReader;
import in.codecompass.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static in.codecompass.Driver.DriverManager.getDriver;


public class CommonToAllPage {
    public CommonToAllPage() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }
    public void openWiseUrl(){
        getDriver().get(PropertiesReader.readKey("url"));
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }


    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement by){

        return by.getText();
    }
    public void clickUsingActions(By by){
        WebElement element = getDriver().findElement(by);
        Actions actions =new Actions(getDriver());
        actions.click(element).build().perform();
    }
    public void clickUsingActionsListofelement(By by){
        List<WebElement> element = getDriver().findElements(by);
        Actions actions =new Actions(getDriver());
        actions.moveToElement(element.get(1)).click(element.get(1)).build().perform();
    }
    public  void PressEnter(){
        Actions actions = new Actions(getDriver());
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    }
    public void enterInputusingActions(By by,String txt){
        WebElement input = getDriver().findElement(by);
        Actions sc = new Actions(getDriver());
        sc.moveToElement(input).sendKeys(txt).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    }
    public void enterInputusingActions2(By by,String txt){
        WebElement input = getDriver().findElement(by);
        Actions sc = new Actions(getDriver());
        sc.moveToElement(input).sendKeys(txt).keyDown(Keys.ENTER).keyUp(Keys.ENTER).sendKeys(Keys.ESCAPE).build().perform();

    }
}
