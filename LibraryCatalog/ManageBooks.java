package library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class ManageBooks{
	ArrayList<Book> books;
	Scanner menuInput = new Scanner(System.in);
	int select;

	public ManageBooks() {
		books = new ArrayList<Book>();
		// TODO Auto-generated constructor stub
	}

	public void addBook(Book book) {
		books.add(book);
	}

	// This method checks the books ArrayList to see if the book with the title
	// exists.
	public String borrowBook(String bookTitle) {
		Book libraryBook;
		String libraryBookTitle;

		for (int i = 0; i < books.size(); i++) {
			libraryBook = books.get(i);
			libraryBookTitle = libraryBook.getTitle();

			if (libraryBookTitle.equals(bookTitle)) {
				if (!(libraryBook.isBorrowed())) {
					libraryBook.borrowed();
					System.out.println("The book was borrowed " + libraryBookTitle);
					return null;
				} else {
					System.out.println("Sorry, this books is already borrowed.");
					return null;
				}
			}
		}
		System.out.println("Sorry, this book is already borrowed.");
		return null;
	}

	// This method goes through the list and prints the books that are in stock
	public void printAvailableBooks() {
		Book libraryBook;
		boolean libraryIsEmpty = true;

		for (int i = 0; i < books.size(); i++) {
			libraryBook = books.get(i);

			if (!(libraryBook.isBorrowed())) {
				System.out.println("ID: " + libraryBook.getId() + " Title: " + libraryBook.getTitle() + " Pages: " + libraryBook.getPages());
				libraryIsEmpty = false;
			}
		}

		if (libraryIsEmpty) {
			System.out.println("No books in catalog.");
		}
	}

	public void returnBook(String bookTitle) {
		Book libraryBook;
		String libraryBookTitle;
		int ok = 1;

		for (int i = 0; i < books.size(); i++) {
			libraryBook = books.get(i);
			libraryBookTitle = libraryBook.getTitle();

			if (libraryBookTitle.equals(bookTitle)) {
				if (libraryBook.isBorrowed()) {
					libraryBook.returned();
					System.out.println("You successfully returned " + libraryBookTitle);
					ok = 0;
					break;
				}
			}
		}

		if (ok == 1) {
			System.out.println("Your book was not found in the library catalog.");
		}
	}

	void menuLibrary() {
		ManageBooks library	= new ManageBooks();
		library.addBook(new Book(1,"Amintiri din Copilarie",216));
		library.addBook(new Book(2,"Capra cu trei iezi",179));
		library.addBook(new Book(3,"Harry Potter",678));
		library.addBook(new Book(4,"DEX",770));
		
		
		System.out.println("Welcome to the library!");
		System.out.println("What do you want? ");
		System.out.println("Press 1 - All books available");
		System.out.println("Press 2 - Borrows a books");
		System.out.println("Press 3 - Return a book");
		System.out.println("Press 4 - Exit");
		System.out.print("Choice: ");

		select = menuInput.nextInt();

		switch (select) {
		case 1:
			System.out.println("All books available are: ");
			library.printAvailableBooks();
			menuLibrary();
			break;
		case 2:
			System.out.println("Books that are in stock and can be borrowed: ");
			library.printAvailableBooks();
			library.borrowBook("Harry Potter");
			library.printAvailableBooks();
			menuLibrary();
			break;
		case 3:
			System.out.println("What book do you want to return? ");
			library.borrowBook("Harry Potter");
			library.returnBook("Harry Potter");
			library.printAvailableBooks();
			menuLibrary();
			break;
		case 4:
			System.out.println("Thank you!");
			break;
		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			menuLibrary();
		}
	}
}
