package dynamic_load;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;


public class DynamicLoadExample2Test extends BaseTest {

    @Test
    public void testExample2DynamicLoad() {

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingPage.Example2Page example2Page = dynamicLoadingPage.openEx2PageInNewWindow();

        assertTrue(example2Page.isStartButtonDisplayed(), "The element is NOT displayed");
    }
}
