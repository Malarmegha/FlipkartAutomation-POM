package runnerScripts;

import org.testng.annotations.Test;
import genericScripts.ECommerceBase;
import pageObjects.ECommerceHomePage;

public class ECommerceTest extends ECommerceBase {

    @Test
    public void productSearchAndAddToCart() throws InterruptedException {
        openBrowser();
        launchApplication("https://www.flipkart.com/"); // Replace with any e-commerce URL

        ECommerceHomePage home = new ECommerceHomePage(driver);
        home.searchProduct("Wireless Mouse");
        Thread.sleep(2000);
        Thread.sleep(2000);
        home.addProductToCart();
        home.goToCart();

        Thread.sleep(2000);
        closeBrowser();
    }
}
