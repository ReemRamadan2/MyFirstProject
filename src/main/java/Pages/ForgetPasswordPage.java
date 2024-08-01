package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    WebDriver _driver;

    public ForgetPasswordPage(WebDriver driver){
        _driver = driver;
    }

    private final By emailInput = By.name("email");
    private final By submitButton = By.className("radius");

    public void inssertEmail(String email){
        _driver.findElement(emailInput).sendKeys(email);
    }

    public SecurePage  clickSubmit(){
        _driver.findElement(submitButton).click();
        return new SecurePage(_driver);
    }

}
