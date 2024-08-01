package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver _driver;
    public  LoginPage(WebDriver driver){
        _driver = driver;
    }

    private final By userNameElement = By.cssSelector("input[name='username']");

    private final By passwordElement = By.name("password");

    private final By submitElement = By.cssSelector("[class='radius']");

    public void insertUserName(String userName){
        _driver.findElement(userNameElement).sendKeys(userName);
    }

    public void insertPassword(String  password)
    {
        _driver.findElement(passwordElement).sendKeys(password);
    }

    public SecurePage clickSubmit(){
        _driver.findElement(submitElement).click();
        return new SecurePage(_driver);
    }
}
