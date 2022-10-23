package domaci;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.IOException;


public class Domaci21 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                util.PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        ChromeOptions options = new ChromeOptions();
        options.addArguments("load-extension=C:\\Users\\ACER\\Desktop\\Selenium\\3.14.2_0");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver wd = new ChromeDriver(options);
        wd.switchTo().window(wd.getWindowHandle());
        wd.get("https://demoqa.com/automation-practice-form");
        wd.manage().window().maximize();
        Actions actions = new Actions(wd);


        WebElement firstName = wd.findElement(By.id("firstName"));
        firstName.sendKeys("Nikola");
        WebElement lastName = wd.findElement(By.id("lastName"));
        lastName.sendKeys("Velimirov");
        WebElement email = wd.findElement(By.id("userEmail"));
        email.sendKeys("nikola@gmail.com");
        WebElement gender = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        gender.click();
        WebElement phoneNumber = wd.findElement(By.id("userNumber"));
        phoneNumber.sendKeys("1354968451");
        WebElement dateOfBirth = wd.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();
        WebElement selectYear = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        selectYear.click();
        for (int i = 31; i > 0; i--) {
            selectYear.sendKeys(Keys.ARROW_UP);
        }
        selectYear.sendKeys(Keys.ENTER);
        WebElement selectMonth = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
        selectMonth.click();
        for (int i = 2; i > 0; i--) {
            selectMonth.sendKeys(Keys.ARROW_DOWN);
        }
        selectMonth.sendKeys(Keys.ENTER);
        WebElement selectDay = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[5]"));
        selectDay.click();
        WebElement subject = wd.findElement(By.id("subjectsInput"));
        subject.sendKeys("comp");
        subject.sendKeys(Keys.ENTER);
        WebElement hobbies = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]"));
        hobbies.click();
        WebElement currentAddress = wd.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("znj 4");
        WebElement state = wd.findElement(By.id("state"));
        actions.moveToElement(state);
        state.click();
        WebElement selectState = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        selectState.sendKeys("NCR");
        selectState.sendKeys(Keys.ENTER);
        WebElement city = wd.findElement(By.id("city"));
        city.click();
        WebElement selectCity = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        selectCity.sendKeys("Noida");
        selectCity.sendKeys(Keys.ENTER);
        WebElement pictureInput = wd.findElement(By.id("uploadPicture"));
        pictureInput.sendKeys("C:\\Users\\DIGESTA\\Desktop\\Selenium\\as.JPG");
        WebElement submit = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[11]/div[1]/button[1]"));
        submit.click();


        WebElement checkName = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
        System.out.println("Name: " + checkName.getText().equalsIgnoreCase("Nikola Velimirov"));
        WebElement checkEmail = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"));
        System.out.println("Email: " + checkEmail.getText().equalsIgnoreCase("nikola@gmail.com"));
        WebElement checkGender = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]"));
        System.out.println("Gender: " + checkGender.getText().equalsIgnoreCase("Male"));
        WebElement checkPhone = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]"));
        System.out.println("Phone: " + checkPhone.getText().equalsIgnoreCase("1354968451"));
        WebElement checkBirth = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]"));
        System.out.println("Date of birth: " + checkBirth.getText().equalsIgnoreCase("28 November,1991"));
        WebElement checkSubject = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]"));
        System.out.println("Subject: " + checkSubject.getText().equalsIgnoreCase("Computer Science"));
        WebElement checkHobbies = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[2]"));
        System.out.println("Hobbies: " + checkHobbies.getText().equalsIgnoreCase("Music"));
        WebElement checPicture = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[2]"));
        System.out.println("Picture: " + checPicture.getText().equalsIgnoreCase("as.JPG"));
        WebElement checkAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[2]"));
        System.out.println("Address: " + checkAddress.getText().equalsIgnoreCase("znj 4"));
        WebElement checkStateCity = wd.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[2]"));
        System.out.println("State and City: " + checkStateCity.getText().equalsIgnoreCase("NCR Noida"));


        wd.quit();


    }
}
