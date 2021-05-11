package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {

    private WebDriver driver;
    private By modalWindowText = By.cssSelector("div.modal-title h3");
    private By modalWindowCloseLink = By.cssSelector("div.modal-footer p");
    private By modalWindow = By.id("modal");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindow)));
        return driver.findElement(modalWindowText).getText();
    }

    public void closeModalWindow() {
        driver.findElement(modalWindowCloseLink).click();
    }
}
