package shifting_content;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftContMenuElement;
import pages.ShiftingContentPage;


public class MenuElementsTest extends BaseTest {

    @Test
    public void testElementsQuantity() {
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContentLink();
        ShiftContMenuElement shiftContMenuElement = shiftingContentPage.clickMenuElement1Link();

        Assert.assertEquals(shiftContMenuElement.getMenuElementsQuantity(), 5, "Wrong quantity of elements");
    }
}
