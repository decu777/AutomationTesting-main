package training.tests;

import org.openqa.selenium.devtools.v127.page.model.AdFrameStatus;
import org.testng.annotations.Test;
import training.pages.FramePage;

import static training.constants.MenuKeys.ALERTS_FRAMES_WINDOWS_MENU;
import static training.constants.SubMenuKeys.FRAMES_SUBMENU;

public class FrameTest extends BaseTest{

    @Test
    public void framesTest(){
        homePage.isPageLoaded();
        homePage.selectMenu(ALERTS_FRAMES_WINDOWS_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(FRAMES_SUBMENU);
        FramePage framePage = new FramePage(driver);
        framePage.isPageLoaded();
        framePage.interactiveFrameOne();
        framePage.switchToDefaultPage();
        framePage.interactiveFrameTwo();
    }
}
