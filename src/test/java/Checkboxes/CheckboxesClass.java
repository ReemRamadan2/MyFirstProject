package Checkboxes;

import BaseClass.BaseClass;
import Pages.CheckboxPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class CheckboxesClass extends BaseClass {

    @Test(priority = 1)
    public void testCheckboxOne() {
        CheckboxPage checkboxPage = homePage.clickOnCheckBoses();

        Boolean boxOneIsSelected = checkboxPage.checkBoxOneIsSelected();

        assertTrue(boxOneIsSelected);

    }

    @Test(priority = 2)
    public void testCheckboxTwo() {

        CheckboxPage checkboxPage = homePage.clickOnCheckBoses();
        Boolean boxTwoIsSelected = checkboxPage.checkBoxTwoIsSelected();

        assertFalse(boxTwoIsSelected);

    }

}
