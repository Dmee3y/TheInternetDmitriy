package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.tagName("input");
    private String rangeText;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String moveSliderRight(double sliderRange) {
        for (double i = 0; i < sliderRange; i = i + 0.5) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
            rangeText = driver.findElement(By.xpath("//span[@id='range']")).getText();
        }
        return rangeText;
    }
}
