package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver _driver;

    public HomePage(WebDriver driver){

        _driver = driver;
    }

    private final By authLink = By.xpath("//*[contains(text(),'Form Authentication')]");
    private final By checkBoxes = By.linkText("Checkboxes");
    private final By forgetPassword = By.linkText("Forgot Password");
    private final By statusCode = By.linkText("Status Codes");
    private final By uploadFile = By.linkText("File Upload");
    private final By dynamicLoading = By.linkText("Dynamic Loading");
    private final By dropdwonList = By.linkText("Dropdown");
    private final By jsAlert = By.linkText("JavaScript Alerts");
    private final By entryAd = By.linkText("Entry Ad");

    public LoginPage clickOnAuthLink (){
        _driver.findElement(authLink).click();
        return new LoginPage(_driver);
    }

    public CheckboxPage clickOnCheckBoses(){
        _driver.findElement(checkBoxes).click();
        return new CheckboxPage(_driver);
    }

    public ForgetPasswordPage clickOnForgetPassword(){
        _driver.findElement(forgetPassword).click();
        return new ForgetPasswordPage(_driver);
    }

    public StatusCodePage clickOnStatusCode(){
        _driver.findElement(statusCode).click();
        return new StatusCodePage(_driver);
    }

    public UploadFilePage clickOnUploadFilePage(){
        _driver.findElement(uploadFile).click();
        return new UploadFilePage(_driver);
    }

    public DynamicLoadingPage clickOndynamicLoadingPage(){
        _driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(_driver);
    }

    public DropdwonPage clickOnDropdwonPage(){
        _driver.findElement(dropdwonList).click();
        return new DropdwonPage(_driver);
    }

    public AlertPage jsAlertPage(){
        _driver.findElement(jsAlert).click();
        return new AlertPage(_driver);
    }

    public EntryAdPage entryAdPage(){
        _driver.findElement(entryAd).click();
        return new EntryAdPage(_driver);
    }

}
