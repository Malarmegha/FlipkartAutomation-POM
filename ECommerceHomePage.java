package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECommerceHomePage {

    @FindBy(name="q")  // generic locator for search box (e.g., Flipkart/Amazon)
    private WebElement searchBox;

    @FindBy(xpath="//button[@type='submit']") // generic search button
    private WebElement searchBtn;
    @FindBy(xpath="(//img[@class='DByuf4'])[1]") 
    	    private WebElement img;
    @FindBy(className="NwyjNT") // add to cart button
    private WebElement addToCartBtn;

    @FindBy(xpath="//a[contains(@href,'cart')]")
    private WebElement cartIcon;

    public ECommerceHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);
        searchBtn.click();
    }

    public void addProductToCart() throws InterruptedException {
         img.click();
         Thread.sleep(2000);
        addToCartBtn.click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
