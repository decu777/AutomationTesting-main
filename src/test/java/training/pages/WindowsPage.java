package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WindowsPage extends BasePage{

    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy (xpath = "//button[@id='tabButton']")
    private WebElement newTabElement;

    @FindBy (id = "sampleHeading")
    private WebElement sampleText;

    @FindBy (xpath = "//button[@id='windowButton']")
    private WebElement newWindowElement;

    @FindBy (xpath = "//button[@id='messageWindowButton']")
    private WebElement newWindowMessage;

    @FindBy (xpath = "//body")
    private WebElement messageText;


    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewTab() {
        newTabElement.click();
        String originalWindows = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindows)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Textul din noul tab este: "+ sampleText.getText());
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindows);
    }

    public void clickOnNewWindow(){
       String originalWindows = driver.getWindowHandle();
        newWindowElement.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindows)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Textul din noul tab este: "+ sampleText.getText());
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindows);

    }

    public void clickOnNewWindowMessage(){
        String originalWindows = driver.getWindowHandle();
        newWindowMessage.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindows)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Textul din noul tab este: "+ sampleText.getText());
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindows);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Browser Windows", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }
}
