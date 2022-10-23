package domaci.domaci23LoginLogout.tests;

import com.github.javafaker.Faker;
import domaci.domaci23LoginLogout.pages.DashBoard;
import util.PropertiesReader;
import domaci.domaci23LoginLogout.pages.Login;
import domaci.domaci23LoginLogout.pages.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSignUp {

    private WebDriver webDriver;
    private Login login;
    private SignUp signUp;
    private DashBoard dashBoard;
    private Select select;

    @BeforeMethod
    public void configure() {
        System.out.println("Ovo se izvrsva pre pokretanja test metode");
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        login = new Login(webDriver);
        signUp = new SignUp(webDriver);
        dashBoard = new DashBoard(webDriver);
        webDriver.get("https://www.automationexercise.com");
        webDriver.manage().window().maximize();
    }
    @Test
    public void testSingUp() {
//        String name = Faker.instance().name().fullName();
        login.clickSignUpTab();
        login.inputNameField("Znj");
//        login.inputEmailField(Faker.instance().bothify("?????####@gmail.com"));  za fake email
        login.inputEmailField(Faker.instance().bothify("znj@gmail.com"));
        login.clickSingUp();
        signUp.clickTitle();
        signUp.inputName("Znj");
//        signUp.inputPassword(Faker.instance().bothify("??????????"));
        signUp.inputPassword(Faker.instance().bothify("1234"));
        signUp.selectDays(2);
        signUp.selectMonths("January");
        signUp.selectYear(1991);
        signUp.inputFirstName("Znjika");
        signUp.inputLastName("Znjiki");
        signUp.inputAddress(Faker.instance().address().streetAddress());
        signUp.selectCountry("India");
        signUp.inputState("India");
        signUp.inputCity("City");
        signUp.inputZipcode(Faker.instance().bothify("###########"));
        signUp.inputMobile(Faker.instance().phoneNumber().phoneNumber());
        signUp.createAccount();
        Assert.assertEquals(dashBoard.getAccountCreatedHeadingText(), "ACCOUNT CREATED!",
                "The message should be correct");
    }

    @AfterMethod
    public void close() {
        webDriver.close();
    }
}
