/*
 * LoginTest
 *
 * version 1.0
 *
 * This is a test class with Login tests
 */
package inheritance;


public class LoginTest extends BaseTest {

    @Override
    protected void openApplication() {
        System.out.println("opening the application");
    }

    public void incorrectCredentialsTest() {
//        super.openApplication();
        openApplication();
        System.out.println("attempting to login with invalid credentials");
        System.out.println("validating that I'm still on login page");
    }
}
