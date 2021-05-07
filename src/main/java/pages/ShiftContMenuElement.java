package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftContMenuElement {

    private WebDriver driver;

    public ShiftContMenuElement(WebDriver driver) {
        this.driver = driver;
    }

    public int getMenuElementsQuantity() {

        List<WebElement> menuElements = driver.findElements(By.xpath("//li"));
        return menuElements.size();
    }
}
