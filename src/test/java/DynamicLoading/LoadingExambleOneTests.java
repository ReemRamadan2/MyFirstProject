package DynamicLoading;

import BaseClass.BaseClass;
import Pages.DynamicLoadingPage;
import Pages.LoadingPages;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoadingExambleOneTests extends BaseClass {

    @Test
    public void loadingExampleOne() throws InterruptedException{
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOndynamicLoadingPage();
       // dynamicLoadingPage.clickOnElementOne();
        LoadingPages loadingPages = dynamicLoadingPage.clickOnExampleOne();
        loadingPages.clickOnStartPageOne();
        String expectedResult = "Hello World!";
        assertEquals(expectedResult,loadingPages.validateMassegePageOne());
    }
}
