package training.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class ElementsHelper {

    WebDriver driver;

    JavascriptExecutor js;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void scrollDown() {
        js.executeScript("window.scrollBy(0,160)");
    }

    public void scrollUp() {
        js.executeScript("window.scrollBy(160,0)");
    }

    public void scrollByCoordinates(int y1, int y2) {
        js.executeScript("window.scrollBy("+y1+","+y2+")");
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void fillElement(WebElement element, String text){
        element.sendKeys(text);
    }

    public void selectElementUsingKeys(WebElement element, String value, Keys key){
        fillElement(element, value);
        element.sendKeys(key);
    }

    public void uploadFileToElement(WebElement element){
        String pictureFilePath = "src/test/resources/Screenshot1.png";
        File file = new File (pictureFilePath);
        element.sendKeys(file.getAbsolutePath());
    }

    public void selectElementByTextFromList(String elementName, List<WebElement> elementsList){
        for (WebElement element: elementsList){
            if (element.getText().equals(elementName)){
                element.click();
                break;
            }
        }
    }


}
