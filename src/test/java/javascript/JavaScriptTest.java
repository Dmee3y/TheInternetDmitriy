package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testJavaScriptExecution() {
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDomPageLink();
        largeAndDeepDomPage.scrollToTable();
    }

    @Test
    public void testScrollToParagraph() {
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScrollPageLink();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
