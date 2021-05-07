package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink(String linkText) {
        return driver.findElement(By.linkText(linkText));
    }

    public LoginPage clickFormAuthentification() {
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContentLink() {
        clickLink("Shifting Content").click();
        return new ShiftingContentPage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLink("Dropdown").click();
        return new DropDownPage(driver);
    }

    public HoversPage clickHoversPageLink() {
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesPageLink() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordPageLink() {
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPageLink() {
        clickLink("Horizontal Slider").click();
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlertsPageLink() {
        clickLink("JavaScript Alerts").click();
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPageLink() {
        clickLink("File Upload").click();
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAdPageLink() {
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);
    }

    public WYSIWYGEditorIframePage clickWYSIWYGEditorPageLink() {
        clickLink("WYSIWYG Editor").click();
        return new WYSIWYGEditorIframePage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage() {
        clickLink("Dynamic Loading").click();
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDomPageLink() {
        clickLink("Large & Deep DOM").click();
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollPageLink() {
        clickLink("Infinite Scroll").click();
        return new InfiniteScrollPage(driver);
    }

    public FramesPage clickFramesPageLink() {
        clickLink("Frames").click();
        return new FramesPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsPageLink() {
        clickLink("Multiple Windows").click();
        return new MultipleWindowsPage(driver);
    }

}
