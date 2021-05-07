package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;

public class NestedFrameTest extends BaseTest {

    @Test
    public void testMiddleFrameText() {
        //FramesPage.NestedFramesPage nestedFramesPage = homePage.clickFramesPageLink().clickNestedFramesLink();
        FramesPage framesPage = homePage.clickFramesPageLink();
        FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();

        Assert.assertEquals(nestedFramesPage.switchToMiddleFrame(), "MIDDLE", "Wrong text");
        //Assert.assertEquals(nestedFramesPage.getMiddleFrameText(), "MIDDLE", "Wrong middle frame text");
    }

//    @Test
//    public void testBottomFrameText() {
//        FramesPage.NestedFramesPage nestedFramesPage = homePage.clickFramesPageLink().clickNestedFramesLink();
//
//        nestedFramesPage.switchToBottomFrame();
//        Assert.assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Wrong bottom frame text");
//    }

}
