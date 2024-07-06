package t;

import RemoveLastCharacter2.RemoveLastCharacter2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class T {

    WebDriver driver = new ChromeDriver();

    @Test
    public void tCase1(){
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("Form Authentication")).click();
            driver.findElement(By.name("username")).sendKeys("tomsmith");
            driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.className("radius")).click();
            String actualResult = driver.findElement(By.id("flash")).getText();
            actualResult=  actualResult.replaceAll("\\s+"," ");
            RemoveLastCharacter2 rlc = new RemoveLastCharacter2();
            //actualResult.rlc(actualResult.length()-1);
            actualResult=rlc.removeLastChar(actualResult);
            String expectedResult = "You logged into a secure area! ";
            assertEquals(actualResult,expectedResult);
           // assertTrue(actualResult.contains(expectedResult));

    }
/*
    public void tCase2(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword23!");
        driver.findElement(By.className("radius")).click();
        String actualResult = driver.findElement(By.id("flash")).getText();
        String expectedResult = "You logged into a secure area!";
        assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.contains(expectedResult));

    }

    public void tCase3(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.name("username")).sendKeys("tomsmith23");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualResult = driver.findElement(By.id("flash")).getText();
        String expectedResult = "You logged into a secure area!";
        assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.contains(expectedResult));

    }

 */
}
