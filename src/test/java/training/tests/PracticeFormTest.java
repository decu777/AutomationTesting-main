package training.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import training.pages.CommonPage;
import training.pages.HomePage;
import training.pages.PracticeFormPage;

import java.util.*;

public class PracticeFormTest extends BaseTest{

    //Creem o metoda de test care sa mearga de pe pagina principala pana pe pagina PracticeForms


    private java.time.format.DateTimeFormatter DateTimeFormatter;

    @Test
    public void navigateFromHomePageToPracticeFormPage() {

        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        homePage.selectMenu("Forms");
        CommonPage commonPage = new CommonPage(driver);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu("Practice Form");
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.isPageLoaded();
//        practiceFormPage.fillFirstAndLastName();
//        practiceFormPage.emailInput();
        practiceFormPage.fillEntireForm();
//        pagePracticeForms();
//        scrollDown();
//        numePrenume();
//        emailInput();
//        numarTelefon();
//        genderLabel("Male");
//        selectSubject();
//        hobbiesInput();
//        adresaCurenta();
//        uploadPicture();
//        stateCity();
//        dateOfBirth();
//        pauzaDoi();
//        butonSubmit();
//        validareFormular();
//         selectSubjectValidare();
//        actualValues();

    }

    //Facem o metoda care sa deschida browser-ul

//    public void openBrowser() {
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//    }

    //Facem o metoda care da click pe meniul Forms
//    public void clickFormsMenu() {
//        WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()=\"Forms\"]"));
//        formsMenuElement.click();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public void pagePracticeForms() {
        WebElement spanElement = driver.findElement(By.xpath("//span[text()=\"Practice Form\"]"));
        spanElement.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void scrollDown() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,160)");
//    }

//    public void numePrenume() {
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WebElement firstNameinput = driver.findElement(By.id("firstName"));
//        firstNameinput.sendKeys("Stanciu");
//
//        WebElement lastNameinput = driver.findElement(By.id("lastName"));
//        lastNameinput.sendKeys("Ionut");
//    }

//    public void emailInput() {
//       // WebElement emailInput = driver.findElement(By.id("userEmail"));
//        emailInput.sendKeys("itschool@gmail.com");
//    }

//    public void genderLabel(String gender) {
//        WebElement maleGenderElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement femaleGenderElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement otherGenderElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
//        List<WebElement> genderListElement = new ArrayList<>();
//        genderListElement.add(maleGenderElement);
//        genderListElement.add(femaleGenderElement);
//        genderListElement.add(otherGenderElement);
//
//        for (int index = 0; index < genderListElement.size(); index++) {
//            if (genderListElement.get(index).getText().equals(gender)) {
//                genderListElement.get(index).click();
//            }
//        }
//    }

//    public void numarTelefon() {
//        WebElement numberInput = driver.findElement(By.id("userNumber"));
//        numberInput.sendKeys("07606060606");
//    }

//    public void selectSubject() {
//        WebElement selectSubject = driver.findElement(By.id("subjectsInput"));
//        selectSubject.sendKeys("Accounting");
//        selectSubject.sendKeys(Keys.ENTER);
//        selectSubject.sendKeys("Maths");
//        selectSubject.sendKeys(Keys.ENTER);
//    }

//    public void hobbiesInput() {
//        WebElement hobbiesInput = driver.findElement(By.xpath("//label[text()=\"Sports\"]"));
//        hobbiesInput.click();
//
//        WebElement hobbies2Input = driver.findElement(By.xpath("//label[text()=\"Reading\"]"));
//        hobbies2Input.click();
//    }

//    public void adresaCurenta() {
//        WebElement adresaCurenta = driver.findElement(By.id("currentAddress"));
//        adresaCurenta.sendKeys("Timisoara, nr 32");
//    }

//    public void uploadPicture() {
//        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\stanc\\Desktop/Screenshot 2024-09-27 181553.png");
//    }

//    public void dateOfBirth() {
//        WebElement dayElement = driver.findElement(By.id("dateOfBirthInput"));
//        dayElement.sendKeys("11 January 2004");
//        WebElement defaultElement = driver.findElement(By.id("dateOfBirthInput"));
//        defaultElement.sendKeys(Keys.HOME);
//        for (int index = 1; index <= 11; index++) {
//            defaultElement.sendKeys(Keys.DELETE);
//        }
//        dayElement.sendKeys(Keys.ENTER);
//    }

//    public void stateCity() {
//        WebElement ddown = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
//        ddown.sendKeys("NCR");
//        ddown.sendKeys(Keys.ENTER);
//
//        WebElement ddown2 = ddown.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
//        ddown2.sendKeys("Delhi");
//        ddown2.sendKeys(Keys.ENTER);
//    }
//
//    public void pauzaDoi() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void butonSubmit() {
//        WebElement butonSubmit = driver.findElement(By.id("submit"));
//        butonSubmit.click();
//    }

//        public void scrollDown2() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,10000");
//    }

//    public void incarcareImagine() {
//        WebElement afisareFisier = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
//            afisareFisier.click();
//            getClassLoader().getResource("/Screenshot 2024-09-27 181553.png");
//            /*JFrame frame = new JFrame();
//            JLabel label = new JLabel(imageIcon);
//            frame.add(label);*/
//            afisareFisier.sendKeys("C:\\Users\\stanc\\IdeaProjects\\AutomationTraining\\src\\test\\resources");
//            afisareFisier.sendKeys(Keys.ENTER);

//    driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).click();
//            driver.findElement(By.name("userfile")).click();
//            driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("Screenshot 2024-09-27 181553.png");
//            driver.findElement(By.xpath("//*[@id=\"submit\"]")).sendKeys(Keys.ENTER);


//        public void secondTest(){
//            driver = new ChromeDriver();
//            driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
//            driver.manage().window().maximize();
//
//            driver.findElement(By.name("userfile")).sendKeys("C://Users/stanc/Desktop/Screenshot 2024-09-27 181553.png");
//            //driver.findElement(By.xpath("/html/body/form/input[2]")).click();
//            driver.findElement(By.xpath("/html/body/form/input[2]")).click();

    /*Choice ch = new Choice();
    public void exempluDropdown() {
        *//*WebElement dropdown = driver.findElement(By.id("state"));
        dropdown.sendKeys("NCR");
        dropdown.sendKeys(Keys.ENTER);*//*

        ch.addItem("NCR");*/


    //VALIDARE FORMULAR//

    public boolean numeValidare(String nume) {
        return nume.matches("[a-zA-Z]+");
    }

    public boolean prenumeValidare(String prenume) {
        return prenume.matches("[a-zA-Z]+");
    }

    public boolean emailValidare(String email) {
        return email.contains("@") && email.contains(".");
    }

    public boolean numarTelefonValidare(String numarTelefon) {
        return numarTelefon.matches("\\d{10}");
    }

    public boolean validareGender(String gender) {
        if (gender == null) {
            return false;
        }
        ;
        return gender.equals("Male") || gender.equals("Female");
    }

    public void validareFormular() {
        String nume = "Stanciu";
        String prenume = "Ionut";
        String email = "itschool@gmail.com";
        String numarTelefon = "07606060606";
        String getGender = "Male";
//        String dOB = "11.01.2004";
        String birthDate = "11-01-2004";

        if (numeValidare(nume)) {
            System.out.println("Nume acceptat");
        } else {
            System.out.println("Nume neacceptat");
        }

        if (prenumeValidare(prenume)) {
            System.out.println("Prenume acceptat");
        } else {
            System.out.println("Prenume neacceptat");
        }

        if (numarTelefonValidare(numarTelefon)) {
            System.out.println("Numar corect");
        } else {
            System.out.println("Numar incorect");
        }

        if (validareGender(getGender)) {
            System.out.println("Gender accepted");
            //genderLabel(getGender);
        } else {
            System.out.println("Gender doesn't exist");
        }

        if (emailValidare(email)) {
            System.out.println("Email valid");
        } else {
            System.out.println("Email invalid");
        }
    }

//    public void selectSubjectValidare() {
//        List<WebElement> selectSubjects = driver.findElements(By.id("subjectsInput"));
//        assert selectSubjects.size() > 1 : "Trebuie minim doua elemente selectate!";
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    List<WebElement> selectedSubjects = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("subjects-auto-complete__input")));
//        assert selectedSubjects.size() >= 1 : "Trebuie selectat minim un subiect!";
//        Assert.assertTrue(selectedSubjects.size() >= 1, "Trebuie selectat minim un subiect!");
//        System.out.println("Numar de subiecte selectate: " + selectedSubjects.size());
//    }

//    public void validareHashMapCorrectValues(){
//        Map<String, String> correctValues = new LinkedHashMap<>();
//        correctValues.put("Student Name", "Stanciu Ionut");
//        correctValues.put("Student Email", "itschool@gmail.com");
//        correctValues.put("Gender", "Male");
//    }

    public void actualValues() {
//        Map<String, WebElement> elementeFormular = new HashMap<>();
//        WebElement studentInformations = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[1]"));
//        elementeFormular.put("FFF", studentInformations);
//        elementeFormular.put("ff@gmail.com", studentInformations);
//        elementeFormular.put("Male", studentInformations);
//        elementeFormular.put("1111111111", studentInformations);

        List<String> actuallValues = new ArrayList<>();
        WebElement table = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.println(cell.getText() + "\t");

                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        ArrayList<String> newValues = new ArrayList<>();
        newValues.add("Eduard");

        assert actuallValues.equals(newValues) : "Nu corespund";

//        Assert.assertEquals(actuallValues, newValues);
        System.out.println("Valorile corespund");
    }
}


