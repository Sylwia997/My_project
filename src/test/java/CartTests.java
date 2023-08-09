import Pages.LoginPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartTests extends LoginTests{


    @Test
    //@DisplayName("Adding one product to cart should show products amount in header.")
    public void add_product_to_cart_should_update_amount_in_minicart(){
        objProductsPage = new ProductsPage(driver);
        objProductsPage.addProductToCart("2");
        WebElement total = driver.findElement(By.className("shopping_cart_badge"));
        Assertions.assertEquals("1", total.getText(),
               "Total amount in minicart is not correct.");

    }

    @Test
    public void remove_product_from_cart_should_update_amount_in_minicart(){
        objProductsPage = new ProductsPage(driver);
        objProductsPage.addProductToCart("0")
                        .removeProductFromCart("0");
        Assertions.assertNull(driver.findElement(By.className("shopping_cart_badge")),
                "Total amount in minicart shouldn't appear");

    }

    @Test
    public void check_if_the_price_in_cart_is_the_same_as_on_product_page(){
        objProductsPage = new ProductsPage(driver);
        objProductsPage.addProductToCart("0")
                        .chooseMinicart();
        WebElement productPrice = driver.findElement(By.className("inventory_item_price"));
        Assertions.assertEquals("$29.99", productPrice.getText(),
                "Total price in cart is not correct. Price should show:");
    }
}
