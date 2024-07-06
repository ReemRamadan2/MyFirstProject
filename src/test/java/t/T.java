package t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class T {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualResult = driver.findElement(By.id("flash")).getText();
        String expectedResult = "You logged into a secure area!";
        assertEquals(actualResult,expectedResult);

    }
}
