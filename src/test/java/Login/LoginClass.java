package Login;

import BaseClass.BaseClass;
import Pages.LoginPage;
import Pages.SecurePage;
import RemoveLastCharacter2.RemoveLastCharacter2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginClass extends BaseClass {


    @Test(priority = 1)
    public void testSucessfullLogin(){

       LoginPage loginPage = homePage.clickOnAuthLink();
       loginPage.insertUserName("tomsmith");
       loginPage.insertPassword("SuperSecretPassword!");
       SecurePage messge = loginPage.clickSubmit();
       String expectedResult = "You logged into a secure area!";
       String actualResult = messge.validateMessageContent();
       assertTrue(actualResult.contains(expectedResult));

    }

    @Test(priority = 2)
    public void testInvalidPassword(){
        LoginPage loginPage = homePage.clickOnAuthLink();
        loginPage.insertUserName("tomsmith");
        loginPage.insertPassword("SuperSecretPassword23");
        SecurePage securePage= loginPage.clickSubmit();
        String actualResult =securePage.validateMessageContent();
        String expectedResult = "Your password is invalid!";
        //assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.contains(expectedResult));

    }


    @Test(priority = 3)
    public void testInvalidUserName(){

        LoginPage loginPage = homePage.clickOnAuthLink();
        loginPage.insertUserName("tomsmith23");
        loginPage.insertPassword("SuperSecretPassword!");
        SecurePage securePage= loginPage.clickSubmit();
        String actualResult =securePage.validateMessageContent();
        String expectedResult = "Your username is invalid!";
        //assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.contains(expectedResult));

    }


}
