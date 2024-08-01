package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {

    WebDriver _driver;

    public StatusCodePage(WebDriver driver) {
        _driver = driver;
    }

    private final By status200 = By.linkText("200");
    private final By status301 = By.linkText("301");
    private final By status404 = By.linkText("404");
    private final By status500 = By.linkText("500");

    public SecurePage stutsCode200(){
        _driver.findElement(status200).click();
        return new SecurePage(_driver);
    }

    public SecurePage stutsCode301(){
        _driver.findElement(status301).click();
        return new SecurePage(_driver);
    }

    public SecurePage stutsCode404(){
        _driver.findElement(status404).click();
        return new SecurePage(_driver);
    }

    public SecurePage stutsCode500(){
        _driver.findElement(status500).click();
        return new SecurePage(_driver);
    }

}
