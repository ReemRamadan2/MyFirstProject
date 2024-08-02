package DropDwon;

import BaseClass.BaseClass;
import Pages.DropdwonPage;
import org.testng.annotations.Test;

public class DropdwonTests extends BaseClass {

    @Test
    public void selectOptionFromDropdwon(){
        DropdwonPage dropdwonPage = homePage.clickOnDropdwonPage();
        dropdwonPage.selectOptionFromDropdwon(2);

    }
}
