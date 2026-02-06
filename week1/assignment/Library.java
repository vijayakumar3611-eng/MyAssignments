package week1.assignment;

public class Library {

	// Define a method addBook(String bookTitle) with one input argument
    public String addBook(String bookTitle) {
        // Print the statement "Book added successfully"
        System.out.println("Book added successfully");
        // Add a return statement to return the bookTitle
        return bookTitle;
    }

    // Define a method issueBook()
    public void issueBook() {
        // Print the statement "Book issued successfully"
        System.out.println("Book issued successfully");
    }

    // 2. Create an object for the Library class in the main method
    public static void main(String[] args) {
        Library myLibrary = new Library(); // Object creation [2, 8]
        
        // Call both methods using the object
        myLibrary.addBook("Java Programming");
        myLibrary.issueBook();
    }
}
