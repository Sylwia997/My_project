import Pages.CheckoutPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutTests extends LoginTests{

@Test
    public void user_data_completion_and_transaction_finalization(){
        objCheckoutPage = new CheckoutPage(driver);
        objProductsPage.addProductToCart("2")
                        .chooseMinicart();
        objCheckoutPage.pressCheckout()
                .inputFirstName("Jan")
                .inputLastName("Kowalski")
                .inputPostalCode("10-111")
                .pressContinueButton()
                .pressFinishButton();
        WebElement total = driver.findElement(By.className("complete-header"));
        Assertions.assertEquals("Thank you for your order!", total.getText(),
                "The purchase has not been finalized");

    }

 @Test
    public void total_price_in_checkout_should_be_the_same_as_in_shopping_cart(){
     objCheckoutPage = new CheckoutPage(driver);
     objProductsPage = new ProductsPage(driver);
     objProductsPage.addProductToCart("0")
                    .addProductToCart("1")
                    .addProductToCart("2");
     driver.get(baseUrl + "checkout-step-two.html");
     WebElement totalPrice = driver.findElement(By.className("summary_total_label"));
     Assertions.assertEquals("Total: $60.45", totalPrice.getText(),
             "Total price is not correct");






 }


}
