package Checkboxes;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class CheckboxesClass extends BaseClass {

    @Test(priority = 1)
    public void testCheckboxOne() {
        driver.findElement(By.linkText("Checkboxes")).click();
        WebElement boxOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        boxOne.click();
        Boolean boxOneIsSelected = boxOne.isSelected();

        assertTrue(boxOneIsSelected);

    }

    @Test(priority = 2)
    public void testCheckboxTwo() {
        driver.findElement(By.linkText("Checkboxes")).click();
        WebElement boxOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        boxOne.click();
        Boolean boxOneIsSelected = boxOne.isSelected();

        assertFalse(boxOneIsSelected);

    }



}
