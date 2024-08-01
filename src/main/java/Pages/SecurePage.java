package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {

    WebDriver _driver;

    public SecurePage(WebDriver driver) {
        _driver = driver;
    }

    private final By validateMessage = By.id("flash");
    private final By validateEmailMessage = By.xpath("//h1[contains(text(),\"Internal Server Error\")]");

    private final By validateStatus200 = By.xpath("//p[contains(text(),'This page returned a 200 status code.')]");

    private final By validateStatus301 = By.xpath("//p[contains(text(),'This page returned a 301 status code.')]");

    private final By validateStatus404 = By.xpath("//p[contains(text(),'This page returned a 404 status code.')]");

    private final By validateStatus500 = By.xpath("//p[contains(text(),'This page returned a 500 status code.')]");

    private final By validateFileName = By.id("uploaded-files");

    public String validateMessageContent(){
        return _driver.findElement(validateMessage).getText();
    }


    public String validateEmailMessageContent(){
        return _driver.findElement(validateEmailMessage).getText();
    }

    public String validateStatus200Content(){
        return _driver.findElement(validateStatus200).getText();
    }

    public String validateStatus301Content(){
        return _driver.findElement(validateStatus301).getText();
    }

    public String validateStatus404Content(){
        return _driver.findElement(validateStatus404).getText();
    }

    public String validateStatus500Content(){
        return _driver.findElement(validateStatus500).getText();
    }

    public String validateFileNameContent(){
        return _driver.findElement(validateFileName).getText();
    }





}
