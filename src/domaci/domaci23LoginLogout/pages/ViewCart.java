package domaci.domaci23LoginLogout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class ViewCart {

    private WebDriver webDriver;

    private final String CART_IMAGE =  "/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]";


    public ViewCart(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public String getCartImage() {
        WebElement cartImage = webDriver.findElement(By.xpath(CART_IMAGE));
        return cartImage.getAttribute("src");
    }

}