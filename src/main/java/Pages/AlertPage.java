package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver _driver;

    public AlertPage(WebDriver driver){
        _driver = driver;
    }

    private final By jsAlert = By.xpath("//button[contains(text(),'JS Alert')]");
    private final By resulte = By.id("result");

    private final By jsConfirm = By.xpath("//button[contains(text(),'JS Confirm')]");
    private final By jsPrompt = By.xpath("//button[contains(text(),'JS Prompt')]");


    public void clickOnJsAlertButton(){
        _driver.findElement(jsAlert).click();
    }

    public  void acceptAlert(){
        _driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        _driver.switchTo().alert().dismiss();
    }

    public String getResult(){
       return _driver.findElement(resulte).getText();
    }

    public void clickOnJsConfirmButton(){
        _driver.findElement(jsConfirm).click();
    }

    public void clickOnJsPromptButton(){
        _driver.findElement(jsPrompt).click();
    }

    public void acceptPrompt(String text){
        _driver.switchTo().alert().sendKeys(text);
        _driver.switchTo().alert().accept();

    }




}
