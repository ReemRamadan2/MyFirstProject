package StatusCode;

import BaseClass.BaseClass;
import Pages.SecurePage;
import Pages.StatusCodePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodeClass extends BaseClass {

    @Test(priority = 1)
    public void stutsCode200(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCode();

        SecurePage securePage = statusCodePage.stutsCode200();

        Assert.assertEquals("This page returned a 200 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",securePage.validateStatus200Content());
    }

    @Test(priority = 2)
    public void stutsCode301(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCode();

        SecurePage securePage = statusCodePage.stutsCode301();

        Assert.assertEquals("This page returned a 301 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",securePage.validateStatus301Content());
    }

    @Test(priority = 3)
    public void stutsCode404(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCode();

        SecurePage securePage = statusCodePage.stutsCode404();
        Assert.assertEquals("This page returned a 404 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",securePage.validateStatus404Content());
    }

    @Test(priority = 4)
    public void stutsCode500(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCode();

        SecurePage securePage = statusCodePage.stutsCode500();
       Assert.assertEquals("This page returned a 500 status code." + "\n" + "\n" +

                "For a definition and common list of HTTP status codes, go here",securePage.validateStatus500Content());
    }

}
