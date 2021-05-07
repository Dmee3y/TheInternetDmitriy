package hover;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;


public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHoversPageLink();

        HoversPage.PictureCaption caption = hoversPage.hoverOverPicture(0);
        Assert.assertTrue(caption.captionIsDisplayed());
        Assert.assertEquals(caption.getHeaderText(), "name: user1", "Wrong user title");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Wrong link text");
        Assert.assertEquals(caption.getLinkHref(), "http://the-internet.herokuapp.com/users/1", "Wrong link");
    }
}
