package EntryAd;

import BaseClass.BaseClass;
import Pages.EntryAdPage;
import org.testng.annotations.Test;

public class EntryAdTests extends BaseClass {

    @Test
    public void entryAd() throws InterruptedException {
        EntryAdPage entryAdPage = homePage.entryAdPage();
       // Thread.sleep(50000);
        entryAdPage.adClose();
    }
}
