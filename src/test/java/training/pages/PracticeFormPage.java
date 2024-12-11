package training.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends BasePage{

    //WebElemente specifice pentru pagina:
    @FindBy (xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy (id = "firstName")
    private WebElement firstNameinput;

    @FindBy (id = "lastName")
    private WebElement lastNameinput;

    @FindBy (id = "userEmail")
    private WebElement emailInput;

    @FindBy (xpath = "//label[@for='gender-radio-1']")
    private WebElement maleGenderElement;

    @FindBy (xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGenderElement;

    @FindBy (xpath = "//label[@for='gender-radio-3']")
    private WebElement otherGenderElement;

    @FindBy (id = "userNumber")
    private WebElement phoneNumberInput;

    @FindBy (id = "subjectsInput")
    private WebElement subjectsInput;

    @FindBy (xpath = "//label[text()=\"Sports\"]")
    private WebElement hobbiesInput;

    @FindBy (xpath = "//label[text()=\"Reading\"]")
    private WebElement hobbiesInput2;

    @FindBy (id = "currentAddress")
    private WebElement currentAddress;

    @FindBy (id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy (id = "dateOfBirthInput")
    private WebElement dateOfBirth;
    @FindBy (id = "dateOfBirthInput")
    private WebElement defaultElement;

    @FindBy (xpath = "//*[@id=\"react-select-3-input\"]")
    private WebElement stateInput;
    @FindBy (xpath = "//*[@id=\"react-select-4-input\"]")
    private WebElement cityInput;

    @FindBy (id = "submit")
    private WebElement submitButton;

    @FindBy (id = "closeLargeModal")
    private WebElement closeForm;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    //Metode specifice paginii:

    public void fillEntireForm(){
        fillFirstAndLastName();
        emailInput();
        elementsHelper.scrollDown();
        genderLabel("Male");
        phoneNumberInput();
        selectSubject();
        elementsHelper.scrollDown();
        hobbiesInput();
        currentAddress();
        uploadPicture();
        dateOfBirth();
        elementsHelper.scrollDown();
        stateAndCity();
        pause();
        elementsHelper.scrollDown();
        submitButton();
        pause2();
    }

    public void emailInput() {
        emailInput.sendKeys("itschool@gmail.com");
    }

    public void fillFirstAndLastName() {
        elementsHelper.fillElement(firstNameinput,"Stanciu");
        elementsHelper.fillElement(lastNameinput, "Ionut");
    }

    public void genderLabel(String gender) {
        List<WebElement> genderListElement = new ArrayList<>();
        genderListElement.add(maleGenderElement);
        genderListElement.add(femaleGenderElement);
        genderListElement.add(otherGenderElement);

        elementsHelper.selectElementByTextFromList(gender, genderListElement);
    }

    public void phoneNumberInput(){
        elementsHelper.fillElement(phoneNumberInput,"07707070707");
    }

    public void selectSubject(){
        elementsHelper.selectElementUsingKeys(subjectsInput, "Accounting", Keys.ENTER);
        elementsHelper.selectElementUsingKeys(subjectsInput, "Maths", Keys.ENTER);
    }

    public void hobbiesInput(){
        elementsHelper.clickElement(hobbiesInput);
        elementsHelper.clickElement(hobbiesInput2);
    }

    public void currentAddress(){
        elementsHelper.fillElement(currentAddress, "Marte, nr 72");
    }

    public void uploadPicture(){
        elementsHelper.uploadFileToElement(uploadPicture);
    }

    public void dateOfBirth(){
        elementsHelper.selectElementUsingKeys(dateOfBirth, "11 January 2004", Keys.HOME);
        for (int index = 1; index <= 11; index++ ){
            defaultElement.sendKeys(Keys.DELETE);
        }
        dateOfBirth.sendKeys(Keys.ENTER);
    }

//    public void scrollDown() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,160)");
//    }

    public void stateAndCity(){
        elementsHelper.selectElementUsingKeys(stateInput, "NCR", Keys.ENTER);
        elementsHelper.selectElementUsingKeys(cityInput, "Delhi", Keys.ENTER);
    }

    public void pause(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void submitButton(){
        elementsHelper.clickElement(submitButton);
    }

    public void pause2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeTheForm(){
        elementsHelper.clickElement(closeForm);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Practice Form", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }
}
