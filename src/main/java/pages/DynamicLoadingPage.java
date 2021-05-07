package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;


    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private By example2Link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1() {
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }

    public class Example1Page {

        private WebDriver driver;

        private By startButton = By.cssSelector("#start button");
        private By loadingIndicator = By.id("loading");
        private By finishText = By.id("finish");

        public Example1Page(WebDriver driver) {
            this.driver = driver;
        }

        public void clickStartButton() {
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 7);
            //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
        }

        public String getFinishText() {
            return driver.findElement(finishText).getText();
        }
    }

    public Example2Page openEx2PageInNewWindow() {

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL);
        driver.findElement(example2Link).click();
        action.keyDown(Keys.CONTROL).build().perform();
        return new Example2Page(driver);
    }

    public class Example2Page {
        private WebDriver driver;
        private  By startButton = By.id("start");

        public Example2Page(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isStartButtonDisplayed() {
            driver.findElement(startButton).isDisplayed();
            return true;
        }
    }
}
