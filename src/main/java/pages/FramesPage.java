package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FramesPage {

    private WebDriver driver;

    private  By nestedFramesLink = By.xpath("//a[contains(text(),'Nested Frames')]");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesLink() {
        driver.findElement(nestedFramesLink).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return new NestedFramesPage(driver);
    }

    public class NestedFramesPage {

        private WebDriver driver;

        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;
        }

        public String switchToMiddleFrame() {
           // WebElement topFrameElement = driver.findElement(By.xpath("//frame[@name='frame-top']"));
            //WebDriverWait wait = new WebDriverWait(driver, 5);
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
            //driver.switchTo().defaultContent();
            driver.switchTo().defaultContent();
            String title = driver.switchTo().frame(0).switchTo().frame(1).getTitle();
            //driver.findElement(By.xpath("//frame[@name='frame-middle']")).click();
            return title;
        }

        public String getMiddleFrameText() {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            String middleFrameText = driver.findElement(By.xpath("//*[@name='frame-middle']")).getText();
            return middleFrameText;
        }

//        public void switchToBottomFrame() {
//            WebElement bottomFrameElement = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
//            driver.switchTo().frame(1);
//        }
//
//        public String getBottomFrameText() {
//            String bottomFrameText = driver.findElement(bottomFrame).getText();
//            return bottomFrameText;
//        }

    }
}
