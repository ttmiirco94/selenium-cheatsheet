import helper.TestUtilities;
import org.testng.annotations.Test;
import pages.GooglePOM;

import static org.testng.Assert.assertEquals;

public class OpenGoogleTest extends TestUtilities {

    @Test
    public void loadPage() {
        System.out.println("Starting logIn test");

        GooglePOM googlePOM = new GooglePOM(driver);
        googlePOM.goToPage();
        googlePOM.verifyUrl();
    }
}