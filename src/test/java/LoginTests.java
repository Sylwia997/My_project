import Pages.LoginPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class LoginTests extends BaseTest{

    String password = "secret_sauce";

    @BeforeEach
    public  void user_has_been_correctly_logged_in()  {

        objLogInPage = new LoginPage(driver);
        driver.get(baseUrl);
        objLogInPage.inputUsername("standard_user")
                .inputPassword(password)
                .submit();
        Assertions.assertEquals(baseUrl + "inventory.html", driver.getCurrentUrl(),
                "URL address of the main page is not what expected.");



    }


    public void blocked_user_cannot_log_in() {
        objLogInPage = new LoginPage(driver);
        driver.get(baseUrl);
        objLogInPage.inputUsername("locked_out_user")
                .inputPassword(password)
                .submit();
        WebElement errorMessage = wait.until(driver ->
                driver.findElement(By.className("error-message-container")));
        Assertions.assertEquals("Epic sadface: Sorry, this user has been locked out.", errorMessage.getText(),
                "Error message does not appear. It should appear when user is blocked");

    }
}
