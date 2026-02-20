package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Assignment Detail: Input String
        String text = "We learn Java basics as part of java sessions in java week1";
        
        // Requirement: Initialize a variable 'count' to track duplicate words found
        int count = 0;

        // Requirement: Split the text into an array of words using space as the delimiter
        String[] words = text.split(" ");

        // Requirement: Create two nested for loops to compare each word with every other word
        for (int i = 0; i < words.length; i++) {
            // Internal loop starts from the next word to avoid comparing a word with itself
            for (int j = i + 1; j < words.length; j++) {
                
                // Hint: Use the appropriate method for case-insensitive string comparisons
                // Requirement: If a duplicate word is found, replace it with an empty string
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    words[j] = ""; 
                    count++; // Requirement: Increment count
                }
            }
        }

        // Requirement: If count > 1, print the modified words array
        // Hint: Use another for loop to print the modified String array
        if (count > 0) {
            for (int k = 0; k < words.length; k++) {
                // We print the word followed by a space, even if it's an empty string
                System.out.print(words[k] + " ");
            }
        }

	}

}
