package training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class WebElementTest {

    //Declaram o variabila globala pt dimeniusea tabelului
    int initialTableSize = 0;

    public WebDriver driver;

//@Test
public void testWebTables(){
openBrowser();
clickWebElement();
clickWebTables();
getInitialTableSize();
addButton();
firstNameInput();
lastNameInput();
emailNameInput();
ageInput();
salaryInput();
departmentInput();
submitInput();
newRecordTabel();
}

String numeStudent = "Eduard-Marta";
String prenumeStudent = "Vorbareata";
String emailStudent = "edi22@gmail.com";
String ageStudent = "26";
String salariuStudent = "2800";
String departamentStudent = "OF Chatter";

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    public void clickWebElement() {
        WebElement webTablesElement = driver.findElement(By.xpath("//h5[text()=\"Elements\"]"));
        webTablesElement.click();
    }

    public void clickWebTables(){
        WebElement webTableMenu = driver.findElement(By.xpath("//span[text()=\"Web Tables\"]"));
        webTableMenu.click();
    }

    public void addButton(){
        WebElement addPeopleInForm = driver.findElement(By.id("addNewRecordButton"));
        addPeopleInForm.click();
    }

    public void firstNameInput(){
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Eduard-Marta");
    }

    public void lastNameInput(){
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Vorbareata");
    }

    public void emailNameInput(){
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("Edi22@gmail.com");
    }

    public void ageInput(){
        WebElement ageInput = driver.findElement(By.xpath("//input[@id=\"age\"]"));
        ageInput.sendKeys("26");
    }

    public void salaryInput(){
        WebElement salaryInput = driver.findElement(By.xpath("//*[@id=\"salary\"]"));
        salaryInput.sendKeys("2800");
    }

    public void departmentInput(){
        WebElement departmentInput = driver.findElement(By.xpath("//*[@id=\"department\"]"));
        departmentInput.sendKeys("OF Chatter");
    }

    public void submitInput(){
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton.click();
    }

    //public void numarInitialPersoane(){
//        List<WebElement> numarInitial = new ArrayList<>();
//        numarInitial.add(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div")));
//        numarInitial.add(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div")));
//        numarInitial.add(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div")));
//        System.out.println("Persoanele din tabel sunt " + numarInitial.size());
   // }

    //Facem o metoda prin care luam marimea initiala a tabelului
    public int getInitialTableSize(){
        List<WebElement>tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        initialTableSize = tableElements.size();
        System.out.println("Numar persoane in tabel " +initialTableSize);
        return initialTableSize;
    }

    //Facem o metoda prin care validam adaugarea unei lini noi in tabel
    public void newRecordTabel(){
        List<WebElement> newRow = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int actualTableSize = newRow.size();
        int expectedTableSize = initialTableSize +1;
        Assert.assertEquals(actualTableSize, expectedTableSize, "Actual table size " +actualTableSize + " is different than " + expectedTableSize);
        System.out.println("Initial table size was: " +initialTableSize + " but after is " +expectedTableSize);
    }
}
