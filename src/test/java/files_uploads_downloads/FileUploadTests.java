package files_uploads_downloads;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickFileUploadPageLink();

        fileUploadPage.uploadFile("C://Users//dtous//Desktop//kolobok.txt");
        Assert.assertEquals(fileUploadPage.getUploadedFiles(), "kolobok.txt", "Wrong upload");
    }
}
