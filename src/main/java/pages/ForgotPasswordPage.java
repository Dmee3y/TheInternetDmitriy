package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInputField = By.tagName("input");
    private By retrievePasswordButton = By.tagName("i");
    private String email = "email@email.ru";

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public RetrievePasswordNewPage retrievePassword() {
        driver.findElement(emailInputField).sendKeys(email);
        driver.findElement(retrievePasswordButton).click();
        return new RetrievePasswordNewPage();
    }

    public class RetrievePasswordNewPage {
        private By errorMessage  = By.xpath("//h1[contains(text(),'Internal Server Error')]");

        public String getMessageText () {
            return driver.findElement(errorMessage).getText();
        }
    }
}
