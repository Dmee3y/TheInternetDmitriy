package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorIframePage {
    private WebDriver driver;

    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//button[@title='Increase indent']");

    public WYSIWYGEditorIframePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainAreaPage();
    }

    public void switchToTextArea() {
        driver.switchTo().frame(frameId);
    }

    public void switchToMainAreaPage() {     //EXIT iFrame area
        driver.switchTo().parentFrame();
    }

    public void sendTextToTextArea(String text) {
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainAreaPage();
    }

    public void increaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextAreaContent() {
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainAreaPage();
        return text;
    }
}
