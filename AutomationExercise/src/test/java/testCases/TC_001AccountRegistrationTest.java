package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountSignupLoginPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001AccountRegistrationTest extends BaseClass {

    // ========== TEST CASE ==========
    @Test(groups = {"Regression","Master"})
    public void accountVerification() {

        logger.info("===== Starting Account Registration Test =====");
        try {
            HomePage hp = new HomePage(driver);
            hp.clickSignupLogin();
            logger.info("Clicking on My Account");

            AccountSignupLoginPage aslp = new AccountSignupLoginPage(driver);
            String confirmationMsg = aslp.getConfirmationMessage();
            logger.info("Confirmation message received: " + confirmationMsg);

            if (confirmationMsg.equals("New User Signup!")){
                Assert.assertTrue(true);
                logger.info("Test Passed ");
            }
            else {
                logger.error("Test Failed-");
                logger.info("Debug logs...");
                Assert.assertTrue(false);
            }
            //   Assert.assertEquals(confirmationMsg, "Your Account Has Been Created!");

        } catch (AssertionError e) {
            logger.info("Test Failed - " + e.getMessage());
            Assert.fail();
        }

        logger.info("===== Account Registration Test Completed =====");
    }
}
