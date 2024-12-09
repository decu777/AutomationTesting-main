package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramePage extends BasePage{

    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;
    @FindBy (xpath = "//iframe[@id='frame1']")
    private WebElement frameOneElement;
    @FindBy (id = "sampleHeading")
    private WebElement sampleText;
    @FindBy (xpath = "//iframe[@id='frame2']")
    private WebElement frameTwoElement;

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Frames", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }

    public void interactiveFrameOne (){
        driver.switchTo().frame(frameOneElement);
        System.out.println("Testul din framu-ul 1 este: " + sampleText.getText());
    }
    public void switchToDefaultPage(){
        driver.switchTo().defaultContent();
    }
    public void interactiveFrameTwo (){
        driver.switchTo().frame(frameTwoElement);
        System.out.println("Testul din framu-ul 2 este: " + sampleText.getText());
    }

}
