package pages;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class GooglePOM {
    String url = "https://www.google.de/";
    WebDriver driver;

    public GooglePOM(WebDriver driver) {
        System.out.println("Initiate GooglePOM with curren WebDriver");
        this.driver=driver;
    }
    public void goToPage() {
        System.out.println("Go to page: " + url);
        driver.get(url);
    }
    public void verifyUrl() {
        assertEquals(driver.getCurrentUrl(), "https://www.google.de/");
    }
}
