package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {

    private WebDriver driver;
    private By menuItems = By.xpath("//a[contains(text(),'Example 1: Menu Element')]");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }
    public ShiftContMenuElement clickMenuElement1Link() {
        driver.findElement(menuItems).click();
        return new ShiftContMenuElement(driver);
    }
}