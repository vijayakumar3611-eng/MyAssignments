package week3.day2;

public class APIClient {

    // Overloaded method: Accepts one String argument for endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Overloaded method: Accepts endpoint, requestBody, and requestStatus
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Successful: " + requestStatus);
    }

    public static void main(String[] args) {
        // Create an object of APIClient
        APIClient client = new APIClient();

        System.out.println("--- Testing Version 1 (Single Argument) ---");
        // Calling the first version
        client.sendRequest("https://api.example.com/v1/users");

        System.out.println("\n--- Testing Version 2 (Three Arguments) ---");
        // Calling the second version
        client.sendRequest("https://api.example.com/v1/login", "{ \"user\": \"admin\" }", true);
    }
}
