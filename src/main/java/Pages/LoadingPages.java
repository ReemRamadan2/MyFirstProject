package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadingPages {

    WebDriver _driver;

    WebDriverWait wait;

    public LoadingPages(WebDriver driver) {
        _driver = driver;
    }

    private final By startButton = By.cssSelector("#start button");
    private final By validationMessagePageOne = By.cssSelector("#finish h4");

    public void clickOnStartPageOne(){
        _driver.findElement(startButton).click();
    }

    public String validateMassegePageOne(){
        wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(_driver.findElement(validationMessagePageOne)));
        return  _driver.findElement(validationMessagePageOne).getText();

    }

}
