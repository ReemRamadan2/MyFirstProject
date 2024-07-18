package Checkboxes;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesClass extends BaseClass {

    @Test(priority = 1)
    public void testSelectAllcheckList(){
        driver.findElement(By.linkText("Checkboxes")).click();
        List<WebElement> chkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        int size =chkBoxes.size();

        for (int i=0; i<size; i++){
            if (!chkBoxes.get(i).isSelected() ) {
                chkBoxes.get(i).click();
            }
        }
    }

    @Test(priority = 2)
    public void selectCheckUncheckedBox(){
        driver.findElement(By.linkText("Checkboxes")).click();
        List<WebElement> chkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        int size =chkBoxes.size();

        for (int i=0; i<size; i++) {
            System.out.println("is  selected : "+chkBoxes.get(i).isSelected());
                chkBoxes.get(i).click();
        }
    }






}
