import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    LoginPage objLogInPage;
    ProductsPage objProductsPage;
    CheckoutPage objCheckoutPage;
    protected final String baseUrl = "https://www.saucedemo.com/";

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));}


  @AfterEach
  public void quitDriver(){
    driver.quit();
   }

}
