package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage {

    WebDriver _driver;
    public CheckboxPage(WebDriver driver) {
        _driver = driver;
    }

    private final By checkBoxOne = By.xpath("(//input[@type='checkbox'])[1]");


   private final By checkBoxTwo = By.xpath("(//input[@type='checkbox'])[2]");

    public Boolean checkBoxOneIsSelected(){
        WebElement checkboxOne = _driver.findElement(checkBoxOne);
        checkboxOne.click();
        Boolean checkboxVariable = checkboxOne.isSelected();
        return checkboxVariable;
    }

    public Boolean checkBoxTwoIsSelected(){
        WebElement checkboxTwo = _driver.findElement(checkBoxTwo);
        checkboxTwo.click();
        Boolean checkboxVariable = checkboxTwo.isSelected();
        return checkboxVariable;
    }
}
