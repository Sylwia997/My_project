package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private @FindBy(id="user-name")
    WebElement username;

    private @FindBy(id="password")
    WebElement password;

    private @FindBy(id="login-button")
    WebElement loginButton;



    public LoginPage(WebDriver driver)
    {super(driver);}



    public LoginPage inputUsername(String strUsername) {
        username.sendKeys(strUsername);
        return this;

    }

    public LoginPage inputPassword(String strPassword) {
        password.sendKeys(strPassword);
        return this;
    }
    public LoginPage submit(){
        loginButton.click();
        return this;

    }


}
