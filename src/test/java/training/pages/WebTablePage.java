package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends BasePage{

    //webelemente specifice paginii
    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy(id = "addNewRecordButton")
    private WebElement addPeopleInForm;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id=\"age\"]")
    private WebElement ageInput;

    @FindBy(xpath = "//*[@id=\"salary\"]")
    private WebElement salaryInput;

    @FindBy(xpath = "//*[@id=\"department\"]")
    private WebElement departmentInput;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    private WebElement submitButton;

    int initialTableSize = 0;

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> tableElements;




    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    public void addButton(){
        elementsHelper.clickElement(addPeopleInForm);
    }

    public void fillTableRow() {
        firstNameInput();
        lastNameInput();
        emailNameInput();
        ageInput();
        salaryInput();
        departmentInput();
    }
        public void firstNameInput () {
            elementsHelper.fillElement(firstName,"Eduard-Marta");
        }

        public void lastNameInput () {
            elementsHelper.fillElement(lastName, "Vorbareata");
        }

        public void emailNameInput () {
            elementsHelper.fillElement(emailInput, "Edi22@gmail.com");
        }

        public void ageInput () {
            elementsHelper.fillElement(ageInput, "26");
        }

        public void salaryInput () {
            elementsHelper.fillElement(salaryInput, "2800");
        }

        public void departmentInput () {
            elementsHelper.fillElement(departmentInput, "OF Chatter");
        }

        public void submitInput () {
            elementsHelper.clickElement(submitButton);
        }



    //Facem o metoda prin care luam marimea initiala a tabelului
    public int getInitialTableSize(){
        initialTableSize = tableElements.size();
        System.out.println("Numar persoane in tabel " +initialTableSize);
        return initialTableSize;
    }

    //Facem o metoda prin care validam adaugarea unei lini noi in tabel
    public void validateNewTableRecord(){
        int actualTableSize = tableElements.size();
        int expectedTableSize = initialTableSize +1;
        Assert.assertEquals(actualTableSize, expectedTableSize, "Actual table size " +actualTableSize + " is different than " + expectedTableSize);
        System.out.println("Initial table size was: " +initialTableSize + " but after is " +expectedTableSize);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Web Tables", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }

}
