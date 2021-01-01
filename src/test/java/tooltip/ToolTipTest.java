package tooltip;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ToolTipPage;

import static org.testng.Assert.assertTrue;

public class ToolTipTest extends BaseTests {

    @Test
    public void navigation() {

        ToolTipPage toolTipPage = homePage.navigateToToolTipDemoSite();
        assertTrue(toolTipPage.getPageTitle().equals("Tooltip Demo"),"Landing Page is wrong!");

        toolTipPage.moveMouseToDownloadButton();
        assertTrue(toolTipPage.getToolTipValue().equals("What's new in 3.2"),"Message in tooltip is wrong!");
        toolTipPage.clickOnToolTip();
    }

}
