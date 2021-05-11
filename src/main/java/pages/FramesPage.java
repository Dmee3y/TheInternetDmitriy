package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FramesPage {

    private WebDriver driver;

    private  By nestedFramesPageLink = By.xpath("//a[contains(text(),'Nested Frames')]");
    private By topParentFrame = By.xpath("//frame[@name='frame-top']");
    private By topMiddleFrameId  = By.xpath("//frame[@name='frame-middle']");
    private By lowerFrame = By.xpath("//frame[@name='frame-bottom']");
    private By middleTopFrameText = By.id("content");
    private By lowerFrameText = By.xpath("//*");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesLink() {
        driver.findElement(nestedFramesPageLink).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return new NestedFramesPage(driver);
    }

    public class NestedFramesPage {

        private WebDriver driver;

        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;
        }

        public String getMiddleFrameText() {
            driver.switchTo().frame(driver.findElement(topParentFrame));
            driver.switchTo().frame(driver.findElement(topMiddleFrameId));
            String topFrameText = driver.findElement(middleTopFrameText).getText();
            driver.switchTo().parentFrame();
            return topFrameText;
        }

        public String getLowerFrameText(){
            driver.switchTo().frame(driver.findElement(lowerFrame));
            String bottomFrameText = driver.findElement(lowerFrameText).getText();
            driver.switchTo().parentFrame();
            return bottomFrameText;
        }
    }
}
