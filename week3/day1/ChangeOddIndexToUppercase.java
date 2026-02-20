package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// Assignment Detail: Input String
        String test = "changeme";

        // Requirement: Convert the given String to a character array
        char[] charArray = test.toCharArray();

        // Requirement: Implement a loop to iterate from end to start
        // Hint: Use the length of the array - 1 to start from the last index
        for (int i = charArray.length - 1; i >= 0; i--) {

            // Requirement: Find the odd index within the loop
            // Hint: Use the modulo operator (%) to check for odd numbers
            if (i % 2 != 0) {
                
                // Requirement: Change character to uppercase only if index is odd
                // Hint: Use toUpperCase() method from the Character class
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Requirement: Print the characters for expected output: cHaNgEmE
        for (char c : charArray) {
            System.out.print(c);
        }

	}

}
