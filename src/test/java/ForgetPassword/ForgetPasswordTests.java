package ForgetPassword;

import BaseClass.BaseClass;
import Pages.ForgetPasswordPage;
import Pages.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTests extends BaseClass {

    @Test(priority = 1)
    public void invalidEmail(){

        ForgetPasswordPage forgetPassword = homePage.clickOnForgetPassword();

        forgetPassword.inssertEmail("reem@gmail.com");

        SecurePage securePage = forgetPassword.clickSubmit();

        Assert.assertEquals("Internal Server Error", securePage.validateEmailMessageContent());


    }
}
