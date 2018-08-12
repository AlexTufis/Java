package library;

public class Book {
	private String title;
	private int page;
	private int id;
	boolean borrowed;
	
	// Creates a new Book
    public Book(int id,String title,int page) 
    {
    	this.id = id;
        this.title = title;
        this.page = page;
    }
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return page;
	}
	public void setPages(int page) {
		this.page = page;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Marks the book as not rented
	public void borrowed() {
		borrowed = true;
	}
	
	// Marks the book as not rented
	public void returned() {
		borrowed = false;
	}
	
	//RETURNS TRUE IF THE BOOK IS RENTED,FALSE OTHERWISE
	public boolean isBorrowed() {
		return borrowed;
	}
	
	
/*	public static void main(String[] arguments) 
    {
        // Small test of the Book class
        Book example = new Book(1,"The Da Vinci Code",150);
        System.out.println("Id: " + example.getId());
        System.out.println("Title: " + example.getTitle());
        System.out.println("Pages: " + example.getPages());
    }*/
}
