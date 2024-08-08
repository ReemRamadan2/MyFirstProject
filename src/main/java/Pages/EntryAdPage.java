package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EntryAdPage {

    WebDriver _driver;
    public EntryAdPage(WebDriver driver) {
        _driver  = driver;

    }


    /* WebElement frame1 = _driver.findElement(By.className(".modal"));*/

    public void adClose() throws InterruptedException {
        Thread.sleep(2000);
        WebElement frame1 = _driver.findElement(By.cssSelector(".modal"));

        //Switch to frame with element
        _driver.switchTo().frame(frame1);
        Thread.sleep(2000);
       WebElement checkButtonClose =
               (WebElement) _driver.findElements(By.xpath("//p[contains(text(),'Close')]"));

       checkButtonClose.click();

        _driver.switchTo().defaultContent();


    }


}
