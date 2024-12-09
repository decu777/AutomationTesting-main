package training.pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AlertsPage extends BasePage{

    //webelemente specifice pentru pagina:

    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy (id = "alertButton")
    private WebElement firstAlertButton;

    @FindBy (id = "timerAlertButton")
    private WebElement secondAlert;

    @FindBy (id = "confirmButton")
    private WebElement thirdButton;

    @FindBy (xpath = "//button[@id='promtButton']")
    private WebElement fourthButton;


    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    //metode specifica pentru pagina
    public void interactWithAllAlerts(){
 clickFirstAlertButton();
 clickSecondAlertButton();
 clickThirdButton();
 clickFourthButton();

    }

    public void clickFirstAlertButton(){
        firstAlertButton.click();
        Alert clickOk = driver.switchTo().alert();
        clickOk.accept();
    }

    public void interactWithWaitingAlert(){
        clickSecondAlertButton();
        waitForSecondAlert();
        acceptSecondAlert();
    }

    public void clickSecondAlertButton(){
        secondAlert.click();
    }

    public void waitForSecondAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void acceptSecondAlert(){
        Alert timerAlert = driver.switchTo().alert();
        timerAlert.accept();
        scrollDown();
    }

    public void clickThirdButton(){
        thirdButton.click();
        Alert confirmBoxAlert = driver.switchTo().alert();
        confirmBoxAlert.dismiss();
    }

    public void clickFourthButton(){
        fourthButton.click();

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Emanuel");
        promptAlert.accept();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,160)");
    }


    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Alerts", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }
}
