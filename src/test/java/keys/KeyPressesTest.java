package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;


public class KeyPressesTest extends BaseTest {

    @Test
    public void testBackSpace() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesPageLink();
        keyPressesPage.enterText("Hello World!" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE", "Result is wrong");

    }

    @Test
    public void testShortCuts() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesPageLink();
        keyPressesPage.enterText("Hello World!" + Keys.chord(Keys.CONTROL, "z"));
        Assert.assertEquals(keyPressesPage.getTargetValue(), "Hello World", "Wrong value");
    }
}
