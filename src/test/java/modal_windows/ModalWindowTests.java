package modal_windows;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModalWindowTests extends BaseTest {

    @Test
    public void testModalWindow() {
        EntryAdPage entryAdPage = homePage.clickEntryAdPageLink();
        Assert.assertEquals(entryAdPage.getTitle(), "THIS IS A MODAL WINDOW", "Wrong modal title");
        entryAdPage.closeModalWindow();
    }
}
