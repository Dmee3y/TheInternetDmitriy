package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import static org.testng.Assert.*;

public class NestedFrameTest extends BaseTest {

    @Test
    public void testMiddleFrameText() {
        FramesPage framesPage = homePage.clickFramesPageLink();
        FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();

        assertEquals(nestedFramesPage.getMiddleFrameText(), "MIDDLE", "Wrong middle frame text");
    }

    @Test
    public void testLowerFrameText() {
        FramesPage framesPage = homePage.clickFramesPageLink();
        FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();

        assertEquals(nestedFramesPage.getLowerFrameText(), "BOTTOM", "Wrong lower frame text");
    }
}
