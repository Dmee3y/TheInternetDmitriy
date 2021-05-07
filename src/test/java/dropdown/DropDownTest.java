package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;


public class DropDownTest extends BaseTest {

    @Test
    public void testSelectOption() {
        DropDownPage dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);

        List<String> selectedOptions = dropDownPage.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1, "Wrong number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option is not selected");
    }
}
