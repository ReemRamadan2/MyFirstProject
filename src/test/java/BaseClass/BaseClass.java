package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    protected WebDriver driver;
     @BeforeClass
    public void setUp(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
     }

     @AfterClass
    public void tearDown(){
       //  driver.quit();
     }

     @BeforeMethod
    public void goHome(){
         driver.get("https://the-internet.herokuapp.com/");
     }
}
