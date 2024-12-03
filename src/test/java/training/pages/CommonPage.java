package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CommonPage extends BasePage{

    //WebElemnte specifice paginii:
    @FindBy(css = ".header-text")
    List<WebElement> menuListElement;

    @FindBy (xpath = "//span[@class='text']")
    private List < WebElement > subMenuList;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(driver.getTitle(), "DEMOQA", "Page title is not the expected one");
    }

    public void selectMenu(String menuName){
        //scrollDown();

        for (WebElement element: menuListElement){
            if (element.getText().equals(menuName)) {
                element.click();
                break;
            }
        }
    }

    public void selectSubMenu(String subMenuName){

        for (WebElement element: subMenuList){
            if (element.getText().equals(subMenuName)){
                element.click();
                break;
            }
        }
    }
}
