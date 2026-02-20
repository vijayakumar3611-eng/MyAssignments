package week3.day2;

public class TestData {
    public void enterCredentials() {
        System.out.println("Entering general credentials...");
    }

    public void navigateToHomePage() {
        System.out.println("Navigating to the Home Page...");
    }
}

// Subclass inheriting from TestData
class LoginTestData extends TestData {
    public void enterUsername() {
        System.out.println("Entering Username: admin_user");
    }

    public void enterPassword() {
        System.out.println("Entering Password: secure_password123");
    }
}
