package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class ExercitiiDEMOQA {

    public WebDriver driver;

   @Test
    public void elementsMenuExercices() {
        openBrowser();
        //textBoxMenu();
        //checkBoxMenu();
        //secondMethod();
        //radioButtonMenu();
        //justClickingButtons();
        //linksMenu();
        //clickingErrorLinks();
        //brokenLinksMenu();
        //downloadAndUpload();
        //clickOnAlertsFrameAndWindows();
        //newWindowTab();
        newWindowMessage();
        //frameMenu();
      // secondIframe();
        //nestedFramesMenu();
        //modalDialogs();
        //widgetsMenu();
        //autoComplete();
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    public void textBoxMenu() {
        WebElement elementsMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsMenu.click();

        WebElement clickOnTextBoxMenu = driver.findElement(By.xpath("//span[text()='Text Box']"));
        clickOnTextBoxMenu.click();

        WebElement nameField = driver.findElement(By.id("userName"));
        nameField.sendKeys("Stanciu Ionut");

        WebElement emailFiled = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFiled.sendKeys("it@gmail.com");

        WebElement addressFiled = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        addressFiled.sendKeys("Judet Timis, Oras Timisoara, Calea Sagului, nr 78");

        WebElement permanentAddressField = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        permanentAddressField.sendKeys("Nu se stie");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,160)");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement listaCompletata = driver.findElement(By.xpath("//*[@id='output']"));
        listaCompletata.getSize();
        System.out.println("Lista contine " + listaCompletata.getSize() + "elemente");
    }

    public void checkBoxMenu() {
        WebElement checkBoxMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        checkBoxMenu.click();

        WebElement checkBox = driver.findElement(By.xpath("//span[text()='Check Box']"));
        checkBox.click();

        WebElement checkBoxExample = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        checkBoxExample.click();

        WebElement checkBoxExample2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
        checkBoxExample2.click();

        WebElement checkBoxExample3 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
        checkBoxExample3.click();

        WebElement openMenu = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
        openMenu.click();

        WebElement openMenu2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
        openMenu2.click();

        WebElement checkBoxExample4 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
        checkBoxExample4.click();

        WebElement firstCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
        firstCheckBox.click();

        WebElement secondCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
        secondCheckBox.click();

        WebElement thirdCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
        thirdCheckBox.click();

        WebElement fourthCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
        fourthCheckBox.click();

    }

//    public void secondMethod(){
//        WebElement checkBoxMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        checkBoxMenu.click();
//
//        WebElement checkBox = driver.findElement(By.xpath("//span[text()='Check Box']"));
//        checkBox.click();
//
//        WebElement showAllBoxes = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
//        showAllBoxes.click();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WebElement hideAllBoxes = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
//        hideAllBoxes.click();
//    }

    public void radioButtonMenu() {
        WebElement radioButtonMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        radioButtonMenu.click();

        WebElement clickOnRadioButtonMenu = driver.findElement(By.xpath("//span[text()='Radio Button']"));
        clickOnRadioButtonMenu.click();

        WebElement clickOnYes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        clickOnYes.click();
    }

    public void justClickingButtons() {
        WebElement radioButtonMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        radioButtonMenu.click();

        WebElement clickOnRadioButtonMenu = driver.findElement(By.xpath("//span[text()='Buttons']"));
        clickOnRadioButtonMenu.click();

        WebElement clickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        Actions rightCLick = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();

        WebElement normalClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions normalClickAction = new Actions(driver);
        actions.click(driver.findElement(By.xpath("//button[text()='Click Me']"))).perform();
    }

    public void linksMenu() {
        WebElement linksMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        linksMenu.click();

        WebElement clickOnRadioButtonMenu = driver.findElement(By.xpath("//span[text()='Links']"));
        clickOnRadioButtonMenu.click();

        WebElement simpleLink = driver.findElement(By.id("simpleLink"));
        simpleLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript("window.open('https://demoqa.com/links', 'https://demoqa.com/');");
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);

        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.remove(2));
            driver.close();
            driver.switchTo().window(tabs.get(1));
            driver.close();
        }
    }

    public void clickingErrorLinks() {
        WebElement linksMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        linksMenu.click();

        WebElement clickOnRadioButtonMenu = driver.findElement(By.xpath("//span[text()='Links']"));
        clickOnRadioButtonMenu.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        WebElement firstLink = driver.findElement(By.id("created"));
        firstLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement secondLink = driver.findElement(By.id("no-content"));
        secondLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement thirdLink = driver.findElement(By.id("moved"));
        thirdLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement fourthLink = driver.findElement(By.id("bad-request"));
        fourthLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement fifthLink = driver.findElement(By.id("unauthorized"));
        fifthLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement sixthLink = driver.findElement(By.id("forbidden"));
        sixthLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement seventhLink = driver.findElement(By.id("invalid-url"));
        seventhLink.click();
    }

    public void brokenLinksMenu() {
        WebElement brokenlinks = driver.findElement(By.xpath("//h5[text()='Elements']"));
        brokenlinks.click();

        WebElement clickOnBrokenLinksMenu = driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
        clickOnBrokenLinksMenu.click();

        WebElement validLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[1]"));
        validLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().back();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        WebElement invalidLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[2]"));
        invalidLink.click();
    }

    public void downloadAndUpload() {
        WebElement downloadAndUpload = driver.findElement(By.xpath("//h5[text()='Elements']"));
        downloadAndUpload.click();

        WebElement clickOnDownloadAndUpload = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
        clickOnDownloadAndUpload.click();

        WebElement downloadImagine = driver.findElement(By.id("downloadButton"));
        downloadImagine.click();

        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\stanc\\IdeaProjects\\AutomationTraining\\src\\test\\resources\\sampleFile.jpeg");
    }

    public void clickOnAlertsFrameAndWindows() {
        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindows.click();

        WebElement browserWindowsMenu = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsMenu.click();

        WebElement newTabButton = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTabButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);

        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.remove(1));
            driver.close();
        }
        driver.switchTo().window(tabs.get(0));
    }

    public void newWindowTab() {
        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindows.click();

        WebElement browserWindowsMenu = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsMenu.click();

        WebElement newWindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
        String originalWindow = driver.getWindowHandle();
        newWindowButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (String windowHandle : driver.getWindowHandles()){
            if (!windowHandle.equals(originalWindow)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    public void newWindowMessage(){
        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindows.click();

        WebElement browserWindowsMenu = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsMenu.click();

        WebElement newMessageWindowButton = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        String originalWindows = driver.getWindowHandle();
        newMessageWindowButton.click();
//        WebElement newMessageSample = driver.findElement(By.xpath("/html/body"));
//        String messageSample = newMessageSample.getText();
//
//        System.out.println("Mesajul este: " + messageSample);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (String windowHandle : driver.getWindowHandles()){
            if (!windowHandle.equals(originalWindows)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        driver.close();
        driver.switchTo().window(originalWindows);
    }

    public void frameMenu(){
        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindows.click();

        WebElement frameMenu = driver.findElement(By.xpath("//span[text()='Frames']"));
        frameMenu.click();

        driver.switchTo().frame("frame1");
        WebElement mesajIframe = driver.findElement(By.cssSelector("#sampleHeading"));
        String mesajIFrame = mesajIframe.getText();
        System.out.println("Mesajul din IFrame este: " +mesajIFrame);
    }

    public void secondIframe(){
//        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        alertsFrameWindows.click();
//
//        WebElement frameMenu = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frameMenu.click();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");
        WebElement mesajIframe = driver.findElement(By.cssSelector("#sampleHeading"));
        String mesajFrame = mesajIframe.getText();
        System.out.println("Mesajul din IFrame este: " +mesajFrame);
    }

    public void nestedFramesMenu(){
        WebElement alertsFrameWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindows.click();

        WebElement frameMenu = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
        frameMenu.click();

        driver.switchTo().frame("frame1");
        WebElement mesajIFrame = driver.findElement(By.cssSelector("body > iframe"));
        String mesajFromIFrame = mesajIFrame.getText();
        System.out.println("Mesajul este: " + mesajFromIFrame);

        driver.switchTo().parentFrame();
        WebElement parentIframe = driver.findElement(By.cssSelector("#frame1"));
        String mesajFromParent = parentIframe.getText();
        System.out.println("Mesajul este " + mesajFromParent);
    }

    public void modalDialogs(){
        WebElement alertsFrameWindow = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindow.click();

        WebElement clickOnModalDialogsMenu = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
        clickOnModalDialogsMenu.click();

        WebElement smallModalClick = driver.findElement(By.id("showSmallModal"));
        smallModalClick.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement closeSmallModalDialog = driver.findElement(By.id("closeSmallModal"));
        closeSmallModalDialog.click();

        WebElement clickOnLargeModalDialog = driver.findElement(By.id("showLargeModal"));
        clickOnLargeModalDialog.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement closeLargeModalDialog = driver.findElement(By.id("closeLargeModal"));
        closeLargeModalDialog.click();
    }

    public void widgetsMenu(){
        WebElement clickOnWidgetsMenu = driver.findElement(By.xpath("//h5[text()='Widgets']"));
        clickOnWidgetsMenu.click();

        WebElement accordianMenu = driver.findElement(By.xpath("//span[text()='Accordian']"));
        accordianMenu.click();

        WebElement getFirstQuestion = driver.findElement(By.xpath("//*[@id=\"section1Heading\"]"));
        String accordianFirstQuestion = getFirstQuestion.getText();
        System.out.println("Prima intrebare este " + accordianFirstQuestion);

        WebElement getFirstAnswer = driver.findElement(By.id("section1Content"));
        String accordianFirstAnswer = getFirstAnswer.getText();
        System.out.println("Rapunsul este: " +accordianFirstAnswer);

        WebElement getSecondQuestion = driver.findElement(By.xpath("//*[@id=\"section2Heading\"]"));
        String accordianSecondQuestion = getSecondQuestion.getText();
        System.out.println("A doua intrebare este: " +accordianSecondQuestion);

        WebElement getSecondAnswer = driver.findElement(By.id("section2Content"));
        String accordianSecondAnswer = getSecondAnswer.getText();
        System.out.println("Raspunsul este: " +accordianSecondAnswer);

        WebElement getThirdQuestion = driver.findElement(By.xpath("//*[@id=\"section3Heading\"]"));
        String accordianThirdQuestion = getThirdQuestion.getText();
        System.out.println("A treia intrebare este: " +accordianThirdQuestion);

        WebElement getThirdAnswer = driver.findElement(By.id("section3Content"));
        String accordianThirdAnswer = getThirdAnswer.getText();
        System.out.println("Raspunsul este: " +accordianThirdAnswer);
    }

    public void autoComplete(){
        WebElement clickOnWidgetsMenu = driver.findElement(By.xpath("//h5[text()='Widgets']"));
        clickOnWidgetsMenu.click();
    }
}