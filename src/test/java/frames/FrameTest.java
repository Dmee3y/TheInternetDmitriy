package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorIframePage;

public class FrameTest extends BaseTest {

    @Test
    public void testEditor() {
        WYSIWYGEditorIframePage wysiwygEditorIframePage = homePage.clickWYSIWYGEditorPageLink();

        wysiwygEditorIframePage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";

        wysiwygEditorIframePage.sendTextToTextArea(text1);
        wysiwygEditorIframePage.increaseIndent();

        wysiwygEditorIframePage.sendTextToTextArea(text2);

        Assert.assertEquals(wysiwygEditorIframePage.getTextAreaContent(), text1 + text2, "Wrong text");
    }
}
