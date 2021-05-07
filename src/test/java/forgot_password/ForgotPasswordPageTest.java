package forgot_password;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;


public class ForgotPasswordPageTest extends BaseTest {

    @Test
    public void testForgotPasswordMessage() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPageLink();
        Assert.assertEquals(forgotPasswordPage.retrievePassword().getMessageText(), "Internal Server Error",
                "Wrong error message");
    }
}
