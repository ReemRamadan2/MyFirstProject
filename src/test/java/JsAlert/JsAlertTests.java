package JsAlert;

import BaseClass.BaseClass;
import Pages.AlertPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class JsAlertTests extends BaseClass {

    @Test(priority = 1)
    public void jsAlert(){
        AlertPage alertPage = homePage.jsAlertPage();
        alertPage.clickOnJsAlertButton();
        alertPage.acceptAlert();
        String expected = "You successfully clicked an alert";
        assertEquals(expected,alertPage.getResult());
    }

        @Test(priority = 2)
        public void JsConfirmAccept() {
            AlertPage alertPage = homePage.jsAlertPage();
            alertPage.clickOnJsConfirmButton();
            alertPage.acceptAlert();
            String expected = "You clicked: Ok";
            assertEquals(expected, alertPage.getResult());
        }

    @Test(priority = 3)
    public void JsConfirmDissmis() {
        AlertPage alertPage = homePage.jsAlertPage();
        alertPage.clickOnJsConfirmButton();
        alertPage.dismissAlert();
        String expected = "You clicked: Cancel";
        assertEquals(expected, alertPage.getResult());
    }

    @Test(priority = 4)
    public void JsPromptAccept() {
        AlertPage alertPage = homePage.jsAlertPage();
        //Thread.sleep(3000);

        alertPage.clickOnJsPromptButton();
        alertPage.acceptPrompt("reem");
        String expected = "You entered: reem";
        assertEquals(expected, alertPage.getResult());
    }

}
