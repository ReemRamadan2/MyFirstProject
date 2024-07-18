package ForgetPassword;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordClass extends BaseClass {

    @Test(priority = 1)
    public void invalidEmail(){
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.name("email")).sendKeys("reem@gmail.com");
        driver.findElement(By.className("radius")).click();

      //  String redirectURL=driver.getCurrentUrl();
        WebElement message =  driver.findElement(By.xpath("//h1[contains(text(),\"Internal Server Error\")]"));

        Assert.assertEquals("Internal Server Error", message.getText());


    }
}
