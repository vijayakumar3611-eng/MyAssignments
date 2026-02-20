package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Input array as per assignment details
        int[] arr = {1, 4, 3, 2, 8, 6, 7}; //

        // Hint 1: Sort the array
        Arrays.sort(arr); //

        // Hint 2 & 3: Loop through and check if the iterator matches the value
        // We start 'i' from the first element and compare it with current index value
        for (int i = 0; i < arr.length; i++) {
            int expectedValue = i + 1; // Since sequence starts at 1
            
            if (arr[i] != expectedValue) {
                // Hint 4: Print the missing number
                System.out.println("Missing Number: " + expectedValue); //
                
                // Hint 5: Once printed break the iteration
                break; //
            }
        }

	}

}
