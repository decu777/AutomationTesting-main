package training.tests;

import org.openqa.selenium.devtools.v127.page.model.AdFrameStatus;
import org.testng.annotations.Test;
import training.pages.FramePage;

public class FrameTest extends BaseTest{

    @Test
    public void framesTest(){
        homePage.isPageLoaded();
        homePage.selectMenu("Alerts, Frame & Windows");
        commonPage.isPageLoaded();
        commonPage.selectSubMenu("Frames");
        FramePage framePage = new FramePage(driver);
        framePage.isPageLoaded();
        framePage.interactiveFrameOne();
        framePage.switchToDefaultPage();
        framePage.interactiveFrameTwo();
    }
}
