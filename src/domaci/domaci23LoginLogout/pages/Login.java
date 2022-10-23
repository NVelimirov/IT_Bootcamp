package domaci.domaci23LoginLogout.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver webDriver;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement signUpButton;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
    private WebElement name;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
    private WebElement email;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
    private WebElement button;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
    private WebElement loginEmail;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
    private WebElement loginPassword;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
    private WebElement logInButton;

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement logOut;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")
    private WebElement loginPage;

    public Login(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public void clickSignUpTab(){
        this.signUpButton.click();
    }

    public void inputNameField(String name) {
        this.name.sendKeys(name);
    }

    public void clickSingUp() {
        this.button.click();
    }

    public void inputEmailField(String email) {
        this.email.sendKeys(email);
    }

    public void inputLogInEmail(String email){
        this.loginEmail.sendKeys(email);
    }

    public void inputLogInPassword(String password){
        this.loginPassword.sendKeys(password);
    }

    public void clickLogIn(){
        this.logInButton.click();
    }

    public void clickLogOut(){
        this.logOut.click();
    }

    public String checkIfLogInPage(){
        return this.loginPage.getText();
    }
}
