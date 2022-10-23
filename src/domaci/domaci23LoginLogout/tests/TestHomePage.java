package domaci.domaci23LoginLogout.tests;

import domaci.domaci23LoginLogout.pages.HomePage;
import domaci.domaci23LoginLogout.pages.ViewCart;
import util.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestHomePage {

    private final static String MODAL_TITLE_EXPECTED = "Added!";
    private WebDriver webDriver;
    private HomePage homePage;
    private ViewCart viewCart;

    @BeforeMethod
    public void configure() {
        System.out.println("Ovo se izvrsva pre pokretanja test metode");
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        viewCart = new ViewCart(webDriver);
        webDriver.get("https://www.automationexercise.com/");
        webDriver.manage().window().maximize();
    }


    @Test
    public void testAddToShoppingCardHappyPath() {

        homePage.clickOnHome();
        homePage.scrollToDress(2);
        homePage.hoverToDress(2);
        homePage.clickToAddCartButton();

        Assert.assertEquals(homePage.getModalTitle(), MODAL_TITLE_EXPECTED, "The text should be added");

        homePage.clickToViewCartButton();

        Assert.assertEquals(viewCart.getCartImage(), homePage.getHomeImage(), "the url should be 'get_product_picture/1'");
    }


    @AfterMethod
    public void closeWebDriver() {
        webDriver.close();
    }

}