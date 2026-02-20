package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// Declare the two arrays as per assignment details
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		System.out.println("Matching elements found in both arrays:");
		// Declare for loop iterator to go through the first array
		for (int i = 0; i < array1.length; i++) {

			// Declare a nested for loop to iterate through the second array
			for (int j = 0; j < array2.length; j++) {

				// Compare elements using a conditional statement
				if (array1[i] == array2[j]) {
					// Print the value from the first array when there is a match
					System.out.println(array1[i]);
				}
			}
		}

	}

}
