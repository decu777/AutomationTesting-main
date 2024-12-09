package training.tests;

import org.testng.annotations.Test;
import training.pages.WindowsPage;

public class WindowsTest extends BaseTest{

    @Test
    public void windowsTest(){
        homePage.isPageLoaded();
        homePage.selectMenu("Alerts, Frame & Windows");
        commonPage.isPageLoaded();
        commonPage.selectSubMenu("Browser Windows");
        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.isPageLoaded();
        windowsPage.clickNewTab();
        windowsPage.clickOnNewWindow();
//        windowsPage.clickOnNewWindowMessage();
    }
}
