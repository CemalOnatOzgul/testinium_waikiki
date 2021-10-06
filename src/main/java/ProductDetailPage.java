package pages;

import jdk.jshell.Snippet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    private Snippet By;
    By addToCartButtonLocator = By.id("pd_add_to_cart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    private boolean isDisplayed(By addToCartButtonLocator) {


    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }

    private void click(By addToCartButtonLocator) {


    }
}