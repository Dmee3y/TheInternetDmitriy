package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By picture = By.className("figure");
    private By caption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public PictureCaption hoverOverPicture(int index) {
        WebElement image = driver.findElements(picture).get(index);

        Actions action = new Actions(driver);
        action.moveToElement(image).perform();
        return new PictureCaption(image.findElement(caption));
    }

    public class PictureCaption {

        private WebElement caption;
        private By userNameHeader = By.tagName("h5");
        private By profileLink = By.tagName("a");

        public PictureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean captionIsDisplayed() {
            return caption.isDisplayed();
        }

        public String getHeaderText() {
            return caption.findElement(userNameHeader).getText();
        }

        public String getLinkText() {
            return caption.findElement(profileLink).getText();
        }

        public String getLinkHref() {
            return caption.findElement(profileLink).getAttribute("href");
        }

    }

}
