package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(id="first-name")
    WebElement firstName;
    @FindBy(id="last-name")
    WebElement lastName;
    @FindBy(id="postal-code")
    WebElement postalCode;
    @FindBy(id="continue")
    WebElement continueBtn;
    @FindBy(id="finish")
    WebElement finishBtn;

    @FindBy(id="checkout")
    WebElement checkoutBtn;



    public CheckoutPage(WebDriver driver)
    {super(driver);}

    public CheckoutPage inputFirstName(String strFirstName) {
        firstName.sendKeys(strFirstName);
        return this;

    }

    public CheckoutPage inputLastName(String strLastName) {
        lastName.sendKeys(strLastName);
        return this;
    }

    public CheckoutPage inputPostalCode(String strPostalCode) {
        postalCode.sendKeys(strPostalCode);
        return this;
    }
    public CheckoutPage pressContinueButton() {
        continueBtn.click();
        return this;
    }

    public CheckoutPage pressFinishButton() {
        finishBtn.click();
        return this;
    }
    public CheckoutPage pressCheckout() {
        checkoutBtn.click();
        return this;
    }

}
