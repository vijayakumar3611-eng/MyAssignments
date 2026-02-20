package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialize the input String
		String companyName = "TestLeaf";
		// 2. Convert the given String to a character array
		char[] charArray = companyName.toCharArray();
		// 3. Implement a loop to iterate from end to start
		// Start index: length - 1 (the last character)
		// End index: 0 (the first character)
		for (int i = charArray.length - 1; i >= 0; i--) {

			// 4. Print the characters to display the reversed String
			System.out.print(charArray[i]);
		}

	}

}
