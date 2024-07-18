package UploadFile;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class UploadFileClass extends BaseClass {

    @Test
    public void uploadFile(){
        driver.findElement(By.linkText("File Upload")).click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys("D:/rr1.png");

        driver.findElement(By.id("file-submit")).click();

        WebElement fileName = driver.findElement(By.id("uploaded-files"));

        Assert.assertEquals("rr1.png", fileName.getText());

    }

}
