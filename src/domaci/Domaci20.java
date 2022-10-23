package domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//https://demoqa.com/text-box dohvatit sve elemente i submit formu, + proveriti sa equals da li sabmitovano
//Thread.sleep(1000)
public class Domaci20 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/text-box");

        WebElement inputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        inputName.sendKeys("Zarko");
        Thread.sleep(500);

        WebElement inputEMail = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        inputEMail.sendKeys("zarko@gmail.com");
        Thread.sleep(500);

        WebElement inputCurrentAdress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        inputCurrentAdress.sendKeys("Sremska 4, Beograd");
        Thread.sleep(500);

        WebElement inputPermanentAdress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        inputPermanentAdress.sendKeys("Vuka Vrcevica 4, Beograd");
        Thread.sleep(500);

        WebElement submitButton = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        submitButton.click();

        WebElement submittedName = wd.findElement(By.cssSelector("#name"));
        System.out.println(submittedName.getText().equals("Name:Zarko"));
        WebElement submittedEMail = wd.findElement(By.id("email"));
        System.out.println(submittedEMail.getText().equals("Email:zarko@gmail.com"));
        WebElement submittedCurrentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[3]"));
        System.out.println(submittedCurrentAddress.getText().equals("Current Address :Sremska 4, Beograd"));
        WebElement submittedPemanentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[4]"));
        System.out.println(submittedPemanentAddress.getText().equals("Permananet Address :Vuka Vrcevica 4, Beograd"));


        wd.get("https://demoqa.com/radio-button");
        WebElement radialLike = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]"));
        radialLike.click();
        Thread.sleep(1000);
        WebElement checkLike = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/p[1]/span[1]"));
        System.out.println("Do you like the site? - " + checkLike.getText().equals("Yes"));


        wd.close();
    }
}
