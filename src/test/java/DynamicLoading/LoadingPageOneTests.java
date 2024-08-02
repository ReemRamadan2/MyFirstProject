package DynamicLoading;

import BaseClass.BaseClass;
import Pages.DynamicLoadingPage;
import Pages.LoadingPages;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoadingPageOneTests extends BaseClass {

    @Test(priority = 1)
    public void loadingPageOne() throws InterruptedException{
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOndynamicLoadingPage();
       // dynamicLoadingPage.clickOnElementOne();
        LoadingPages loadingPages = dynamicLoadingPage.clickOnElementOne();
        loadingPages.clickOnStartPageOne();
        String expectedResult = "Hello World!";
        assertEquals(expectedResult,loadingPages.validateMassegePageOne());
    }
}
