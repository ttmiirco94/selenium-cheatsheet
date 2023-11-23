import helper.TestUtilities;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Google;

public class GoogleTest extends TestUtilities {

    @Test
    public void loadPage() {
        System.out.println("Starting logIn test");

        Google google = new Google(driver);
        google.goToPage();
        google.verifyUrl();
    }

    @Test
    public void clickAcceptAllButton() {
        System.out.println("Starting click accept all button test");

        Google google = new Google(driver);
        google.goToPage();
        google.verifyUrl();
        google.clickButtonAcceptAll();
    }

    @Test
    @Parameters({"searchInput"})
    public void searchText(@Optional("Selenium") String searchInput) {
        System.out.println("Starting search input text");

        Google google = new Google(driver);
        google.searchText(searchInput);
    }
}