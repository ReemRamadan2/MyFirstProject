package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdwonPage {

    WebDriver _driver;

    Select select;

    public DropdwonPage(WebDriver driver) {
        _driver = driver;
    }

    private final By dropdwonList = By.id("dropdown");

    public void selectOptionFromDropdwon(int index){
        select = new Select(_driver.findElement(dropdwonList));
        select.selectByIndex(index);

    }
}
