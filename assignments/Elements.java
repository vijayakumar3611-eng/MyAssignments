package week4.assignments;

public class Elements extends Button {
    public static void main(String[] args) {
        
        System.out.println("--- Testing TextField ---");
        TextField txt = new TextField();
        txt.setText("Hello World"); // From WebElement
        System.out.println(txt.getText());

        System.out.println("\n--- Testing CheckBoxButton ---");
        CheckBoxButton chk = new CheckBoxButton();
        chk.click();              // From WebElement
        chk.submit();             // From Button
        chk.clickCheckButton();    // From CheckBoxButton

        System.out.println("\n--- Testing RadioButton ---");
        RadioButton radio = new RadioButton();
        radio.click();            // From WebElement
        radio.submit();           // From Button
        radio.selectRadioButton(); // From RadioButton
    }
}
