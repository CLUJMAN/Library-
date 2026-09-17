import java.time.LocalDate; 
import java.time.temporal.ChronoUnit;


public class Loan {
	private User user; 
	private Book book; 
	private LocalDate borrowDate; 
	private LocalDate dueDate; 
	private boolean returned; 
	
	public Loan(User user, Book book) {
		this.user = user; 
		this.book = book; 
		this.borrowDate = LocalDate.now(); 
		this.dueDate = borrowDate.plusDays(14); 
		this.returned = false; 
	}
	
	public long getOverdueDays() {
		if (!returned && LocalDate.now().isAfter(dueDate)) {
			return ChronoUnit.DAYS.between(dueDate, LocalDate.now()); 
		}
		return 0; 
	}
	
	public double calculateFine() {
		return getOverdueDays() * 0.50; 
	}
	
	public void markReturned() {
		returned = true; 
	}
	public User getUser() {
	    return user;
	}

	public Book getBook() {
	    return book;
	}

	public boolean isReturned() {
	    return returned;
	}
	
	@Override
	public String toString() {
		return user.getName() + " \nHasn't returned " + book.getTitle() 
			   + " \nBy " + book.getAuthor() + " \nBook Number " + book.getBookNumber() 
			   + " \nfor: " + getOverdueDays() + " \nFine is: " + calculateFine(); 
 	}
}
