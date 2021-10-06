package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox ;
    By cartCountLocator = By.id("dropdown-label");
    By cartContainerLocator = By.id("cart-count badge-circle");
    By acceptCookiesLocator = By.id("rd-cart-item-image");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
