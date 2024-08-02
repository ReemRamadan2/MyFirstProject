package DynamicLoading;

import BaseClass.BaseClass;
import Pages.DynamicLoadingPage;
import Pages.LoadingPages;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoadingExampleTwoTests extends BaseClass {

    @Test
    public void loadingExampleTwo(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOndynamicLoadingPage();

        LoadingPages loadingPages = dynamicLoadingPage.clickOnExampleTwo();
        loadingPages.clickOnStartPageTwo();
        String expectedResult = "Hello World!";
        assertEquals(expectedResult,loadingPages.validateMassegePageTwo());
    }
}
