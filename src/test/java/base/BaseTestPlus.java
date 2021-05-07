package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class BaseTestPlus {
    private WebDriver driver;
    //private EventFiringWebDriver driver;
    private String link = "http://the-internet.herokuapp.com/";
    //protected HomePage homePage;

    //@BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        //driver.navigate().to(link);  // the same functionality
        List<WebElement> aLinks = driver.findElements(By.tagName("a"));
        System.out.println("a-links quantity is " + aLinks.size());
        Assert.assertEquals(aLinks.size(),46,"Wrong number of links");



    }
    //@AfterClass
    public void tarDown() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        BaseTest test = new BaseTest();
        test.setUp();
        //test.tarDown();
    }
}
