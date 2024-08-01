package UploadFile;

import BaseClass.BaseClass;
import Pages.SecurePage;
import Pages.UploadFilePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class UploadFileClass extends BaseClass {

    @Test
    public void uploadFile(){

        UploadFilePage uploadFilePage = homePage.clickOnUploadFilePage();
        uploadFilePage.clickOnChoosefile("D:/rr1.png");
        uploadFilePage.fileUpload();
        SecurePage securePage = uploadFilePage.clickOnFileUpload();

       // driver.findElement(By.linkText("File Upload")).click();

       // WebElement chooseFile = driver.findElement(By.id("file-upload"));

      //  chooseFile.sendKeys("D:/rr1.png");

       // driver.findElement(By.id("file-submit")).click();

       // WebElement fileName = driver.findElement(By.id("uploaded-files"));

        Assert.assertEquals("rr1.png", securePage.validateFileNameContent());

    }

}
