package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver _driver;

    public DynamicLoadingPage(WebDriver driver) {
        _driver = driver;
    }

    private final By exampleOneLink = By.partialLinkText("Example 1");
    private final By exampleTwoLink = By.partialLinkText("Example 2");

    public LoadingPages clickOnExampleOne(){
        _driver.findElement(exampleOneLink).click();
        return new LoadingPages(_driver);
    }

    public LoadingPages clickOnExampleTwo(){
        _driver.findElement(exampleTwoLink).click();
        return new LoadingPages(_driver);
    }
}
