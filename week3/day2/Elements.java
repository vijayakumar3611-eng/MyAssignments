package week3.day2;

public class Elements extends Button {
    public static void main(String[] args) {
        
        System.out.println("--- Testing TextField ---");
        TextField txt = new TextField();
        txt.setText("Hello Java"); // From WebElement
        txt.getText();             // From TextField
        txt.click();               // From WebElement

        System.out.println("\n--- Testing CheckBoxButton ---");
        CheckBoxButton cb = new CheckBoxButton();
        cb.click();                // From WebElement
        cb.submit();               // From Button
        cb.clickCheckButton();     // From CheckBoxButton

        System.out.println("\n--- Testing RadioButton ---");
        RadioButton rb = new RadioButton();
        rb.click();                // From WebElement
        rb.submit();               // From Button
        rb.selectRadioButton();    // From RadioButton
    }
}
