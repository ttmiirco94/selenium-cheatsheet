import helper.TestUtilities;
import org.testng.annotations.Test;
import pages.GooglePOM;

public class OpenGoogleTest extends TestUtilities {

    @Test
    public void loadPage() {
        System.out.println("Starting logIn test");

        GooglePOM googlePOM = new GooglePOM(driver);
        googlePOM.goToPage();
        googlePOM.verifyUrl();
    }
}