package domaci.domaci23LoginLogout.tests;


import domaci.domaci23LoginLogout.pages.HomePage;
import domaci.domaci23LoginLogout.pages.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.PropertiesReader;

import java.time.Duration;

public class TestLogInLogOut {

    private WebDriver webDriver;
    private Login login;
    private HomePage homePage;
    private final String logInPageMessage = "Login to your account";

    @BeforeMethod
    private void config(){
        System.setProperty("webdriver.chrome.driver", PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        login = new Login(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://www.automationexercise.com");
        webDriver.manage().window().maximize();
    }
    @Test
    public void testLogIn(){
        login.clickSignUpTab();
        login.inputLogInEmail("znj@gmail.com");
        login.inputLogInPassword("1234");
        login.clickLogIn();
        WebElement loggedUser = webDriver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]/b[1]"));//ako ga stavim kao polje gore, ostane null
        Assert.assertEquals(loggedUser.getText(), homePage.getLoggedUser(), "logged usernames should match" );
    }
    @Test
    public void testLogOut(){
        login.clickSignUpTab();
        login.inputLogInEmail("znj@gmail.com");
        login.inputLogInPassword("1234");
        login.clickLogIn();
        login.clickLogOut();
        Assert.assertEquals(logInPageMessage, login.checkIfLogInPage(), "text should match");
    }

    @AfterMethod
    private void closeWD(){
        webDriver.close();
    }
}
