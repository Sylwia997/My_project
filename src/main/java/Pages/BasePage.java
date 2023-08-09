package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
