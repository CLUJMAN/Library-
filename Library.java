import java.util.ArrayList; 

public class Library {
	private ArrayList<Book> books; 
	private ArrayList<User> users; 
	private ArrayList<Loan> loans; 
	
	public Library() {
		books = new ArrayList<>(); 
		users = new ArrayList<>();
		loans = new ArrayList<>(); 
	}
		
	public void addBook(Book book) {
		books.add(book); 
	}
	
	public void addUser(User user) {
		users.add(user); 
	}
	
	public Book findBook(String bookNumber) {
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i); 
		
			if(book.getBookNumber().equals(bookNumber))
			{
				return book; 
			}
		
		}
		return null; 
	}
	
	public void borrowBook(User user, String bookNumber) {
		Book book = findBook(bookNumber);
		
		if(book == null) {
			System.out.println("Book not found: "); 
		}
		
		else if(!user.canBorrow()) {
			 System.out.println("User has reached the maximum amount of books he can borrow");
			}
		else if(!book.isAvailable()) {
			System.out.println("Book is not available"); 
			}
		else {
			book.borrowBook();
			user.borrowBook(book);
			Loan loan = new Loan(user, book); 
			loans.add(loan); 
			System.out.println(user.getName() + " borrowed " + book.getTitle()); 
			
		}
			
	}
	
	public void returnBook(User user, String bookNumber) {
	    Book book = findBook(bookNumber);

	    if (book == null) {
	        System.out.println("Book not found.");
	    }
	    else if (book.isAvailable()) {
	        System.out.println("This book was not borrowed.");
	    }
	    else {
	        Loan loan = findActiveLoan(user, book);

	        if (loan == null) {
	            System.out.println("No active loan found for this user and book.");
	        }
	        else {
	            double fine = loan.calculateFine();

	            user.returnBook(book);
	            book.returnBook();
	            loan.markReturned();

	            System.out.println("Return information:");
	            System.out.println(loan);

	            if (fine > 0) {
	                System.out.println("Amount owed: $" + fine);
	            } else {
	                System.out.println("No overdue fine.");
	            }
	        }
	    }
	}
	
	public void viewBooks() {
		System.out.println("Library Books: "); 
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i); 
			System.out.println("Book name: " + book.getTitle() + " ID: " + book.getBookNumber() 
			+ " Status: " + book.bookAvailability()); 
			System.out.println(); 
		}
	}

	public void viewUsers() {
		System.out.println("Users: ");
		for(int i = 0; i < users.size(); i++) {
			User user = users.get(i); 
			System.out.println("User name: " + user.getName() + " User ID " + user.getId()); 
		}
	}
	public Loan findActiveLoan(User user, Book book) {
	    for (int i = 0; i < loans.size(); i++) {
	        Loan loan = loans.get(i);

	        if (loan.getUser() == user && loan.getBook() == book && !loan.isReturned()) {
	            return loan;
	        }
	    }

	    return null;
	}
}
