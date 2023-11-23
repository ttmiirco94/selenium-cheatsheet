package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class Google {
    WebDriver driver;
    String url = "https://www.google.de/";
    By inputSearchBar = By.id("APjFqb");
    By buttonSearch = By.xpath("(//input[@name='btnK'])[2]");
    By buttonAcceptAll = By.id("L2AGLb");

    public Google(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage() {
        System.out.println("Go to page: " + url);
        driver.get(url);
    }

    public void verifyUrl() {
        assertEquals(driver.getCurrentUrl(), "https://www.google.de/");
    }

    public WebElement getInputSearchBarElement() {
        return driver.findElement(inputSearchBar);
    }

    public String getInputSearchBar() {
        return getInputSearchBarElement().getAttribute("value");
    }

    public void setInputSearchBar(String value) {
        getInputSearchBarElement().sendKeys(value);
    }

    public WebElement getButtonSearchElement() {
        return driver.findElement(buttonSearch);
    }

    public void clickButtonSearch() {
        getButtonSearchElement().click();
    }

    public WebElement getButtonAcceptAll() {
        return driver.findElement(buttonAcceptAll);
    }

    public void clickButtonAcceptAll() {
        getButtonAcceptAll().click();
    }

    public void searchText(String searchText) {
        this.goToPage();
        this.clickButtonAcceptAll();
        this.setInputSearchBar(searchText);
        assertEquals(this.getInputSearchBar(), searchText);
        this.clickButtonSearch();
    }
}