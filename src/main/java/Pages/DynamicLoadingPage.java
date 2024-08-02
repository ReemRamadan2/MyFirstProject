package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver _driver;

    public DynamicLoadingPage(WebDriver driver) {
        _driver = driver;
    }

    private final By elementOneLink = By.partialLinkText("Example 1");

    public LoadingPages clickOnElementOne(){
        _driver.findElement(elementOneLink).click();
        return new LoadingPages(_driver);
    }
}
