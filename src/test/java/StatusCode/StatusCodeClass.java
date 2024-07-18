package StatusCode;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodeClass extends BaseClass {

    @Test(priority = 1)
    public void stutsCode200(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("200")).click();
        WebElement acualMessage = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]"));
        Assert.assertEquals("This page returned a 200 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",acualMessage.getText());
    }

    @Test(priority = 2)
    public void stutsCode301(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("301")).click();
        WebElement acualMessage = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 301 status code.')]"));
        Assert.assertEquals("This page returned a 301 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",acualMessage.getText());
    }

    @Test(priority = 3)
    public void stutsCode404(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("404")).click();
        WebElement acualMessage = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 404 status code.')]"));
        Assert.assertEquals("This page returned a 404 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",acualMessage.getText());
    }

    @Test(priority = 4)
    public void stutsCode500(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("500")).click();
        WebElement acualMessage = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 500 status code.')]"));
        Assert.assertEquals("This page returned a 500 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",acualMessage.getText());
    }

}
