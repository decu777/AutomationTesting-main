package training.tests;

import org.testng.annotations.Test;
import training.pages.WindowsPage;

import static training.constants.MenuKeys.ALERTS_FRAMES_WINDOWS_MENU;
import static training.constants.SubMenuKeys.WINDOWS_SUBMENU;

public class WindowsTest extends BaseTest{

    @Test
    public void windowsTest(){
        homePage.isPageLoaded();
        homePage.selectMenu(ALERTS_FRAMES_WINDOWS_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(WINDOWS_SUBMENU);
        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.isPageLoaded();
        windowsPage.clickNewTab();
        windowsPage.clickOnNewWindow();
//        windowsPage.clickOnNewWindowMessage();
    }
}
