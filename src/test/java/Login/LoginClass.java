package Login;

import BaseClass.BaseClass;
import RemoveLastCharacter2.RemoveLastCharacter2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginClass extends BaseClass {


    @Test(priority = 1)
    public void testSucessfullLogin(){

            driver.findElement(By.partialLinkText("Form Authentication")).click();
           // driver.findElement(By.name("username")).sendKeys("tomsmith");
           driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");

            driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

            driver.findElement(By.cssSelector("[class='radius']")).click();
            //driver.findElement(By.className("radius")).click();

            String actualResult = driver.findElement(By.id("flash")).getText();
            actualResult=  actualResult.replaceAll("\\s+"," ");
         //   RemoveLastCharacter2 rlc = new RemoveLastCharacter2();
         //   actualResult=rlc.removeLastChar(actualResult);

            String expectedResult = "You logged into a secure area!";

           // assertEquals(actualResult,expectedResult);
            assertTrue(actualResult.contains(expectedResult));
           //driver.quit();
    }

    @Test(priority = 2)
    public void testInvalidPassword(){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword23!");
        driver.findElement(By.className("radius")).click();

        String actualResult = driver.findElement(By.id("flash")).getText();
        actualResult=  actualResult.replaceAll("\\s+"," ");
        RemoveLastCharacter2 rlc = new RemoveLastCharacter2();
        actualResult = rlc.removeLastChar2(actualResult);

        String expectedResult = "Your password is invalid!";
        assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.contains(expectedResult));
       // driver.quit();
    }


    @Test(priority = 3)
    public void testInvalidUserName(){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.name("username")).sendKeys("tomsmith23");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        String actualResult = driver.findElement(By.id("flash")).getText();
        actualResult=  actualResult.replaceAll("\\s+"," ");
        RemoveLastCharacter2 rlc = new RemoveLastCharacter2();
        actualResult = rlc.removeLastChar2(actualResult);

        String expectedResult = "Your username is invalid!";
       // assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.contains(expectedResult));

    }


}
