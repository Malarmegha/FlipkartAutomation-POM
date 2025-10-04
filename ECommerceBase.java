package genericScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceBase {

    public WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void launchApplication(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }
}

