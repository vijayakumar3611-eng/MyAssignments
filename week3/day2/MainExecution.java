package week3.day2;

public class MainExecution {
    public static void main(String[] args) {
        // Demonstrate inheritance by creating objects
        LoginTestData loginData = new LoginTestData();

        System.out.println("--- Methods from LoginTestData ---");
        loginData.enterUsername();
        loginData.enterPassword();

        System.out.println("\n--- Methods inherited from TestData ---");
        loginData.enterCredentials();
        loginData.navigateToHomePage();
    }
}