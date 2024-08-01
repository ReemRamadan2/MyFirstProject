package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadFilePage {

    WebDriver _driver;

    public UploadFilePage(WebDriver driver) {
        _driver = driver;
    }

    private  final By chooseFileButton = By.id("file-upload");
    private  final  By fileUploadButton = By.id("file-submit");
    private  final By fileNameButton = By.id("uploaded-files");


    public void clickOnChoosefile(String file){
        WebElement chooseFile = _driver.findElement(chooseFileButton);

        chooseFile.sendKeys(file);
    }
    public void fileUpload(){
        _driver.findElement(fileUploadButton).click();

    }
    public SecurePage clickOnFileUpload(){
        _driver.findElement(fileNameButton).click();
        return new SecurePage(_driver);
    }


}
