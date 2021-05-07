package alerts;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class AlertTests extends BaseTest {

    @Test
    public void testAlert() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsPageLink();

        javaScriptAlertsPage.clickAlertButton();
        javaScriptAlertsPage.acceptPopUp();
        assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert",
                "Wrong result text");
    }

    @Test
    public void testConfirm() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsPageLink();

        javaScriptAlertsPage.clickConfirmButton();
        String confirmText  = javaScriptAlertsPage.getConfirmText();
        javaScriptAlertsPage.dismissPopUp();
        assertEquals(confirmText, "I am a JS Confirm", "Wrong confirm text");
        assertEquals(javaScriptAlertsPage.getResultText(), "You clicked: Cancel",
                "Wrong confirm text");
    }

    @Test
    public void testPrompt() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsPageLink();

        javaScriptAlertsPage.clickPromptButton();
        String text = "Hi!!!";
        javaScriptAlertsPage.setPromptInput(text);
        javaScriptAlertsPage.acceptPopUp();
        assertEquals(javaScriptAlertsPage.getResultText(), "You entered: " + text, "Wrong Result");
    }
}
