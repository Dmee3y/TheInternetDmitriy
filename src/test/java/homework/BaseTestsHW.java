package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class BaseTestsHW {
    private WebDriver driver;
    private String link = "http://the-internet.herokuapp.com/";


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        List<WebElement> aLinks = driver.findElements(By.xpath("//ul/..//a"));
        System.out.println("a-links (inside ul) quantity is " + aLinks.size());
        Assert.assertEquals(aLinks.size(),44,"Wrong number of links.");
        driver.quit();
    }

    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        BaseTestsHW test = new BaseTestsHW();
        test.setUp();
    }
}
