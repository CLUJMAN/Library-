
public class Book{
	private String bookTitle;
	private String bookAuthor; 
	private boolean available; 
	private String bookNumber; 
	
	public Book(String bookTitle, String bookAuthor, String bookNumber) {
		this.bookTitle = bookTitle; 
		this.bookAuthor = bookAuthor; 
		this.bookNumber = bookNumber;
		this.available = true; 
	}
	
	public String getTitle() {
		return bookTitle; 
	}
	
	public String getAuthor() {
		return bookAuthor; 
	}
	
	public String getBookNumber() {
		return bookNumber; 
	}
	
	public boolean isAvailable() {
		return available; 
	}
	
	public void borrowBook() {
		available = false; 
	}
	
	public void returnBook() {
		available = true; 
	}
	
	public String bookAvailability() {
		if(available) {
			return "Available";
		}
		else {
			return "Not available"; 
		}
	}
	
	@Override
	public String toString() {
		return "Title: " + bookTitle + "\nAuthor: " + bookAuthor 
				+ "\nAvailability: " + bookAvailability() + "\nBook Number: "
				+ bookNumber; 
				
				
	}

}
