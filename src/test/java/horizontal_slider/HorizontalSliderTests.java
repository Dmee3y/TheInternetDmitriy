package horizontal_slider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void testHorizontalSlider() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPageLink();
        Assert.assertEquals(horizontalSliderPage.moveSliderRight(4),"4", "Wrong slider position");
    }
}
