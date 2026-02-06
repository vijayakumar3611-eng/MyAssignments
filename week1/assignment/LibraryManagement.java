package week1.assignment;

public class LibraryManagement {

	public static void main(String[] args) {
		// Create an object for the Library class in the main method of LibraryManagement
        Library lib = new Library();
        
        // Call both methods of the Library class from LibraryManagement and execute
        lib.addBook("Data Structures");
        lib.issueBook();

	}

}
