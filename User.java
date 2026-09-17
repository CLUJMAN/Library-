import java.util.ArrayList;

public class User extends Person {
		
	private ArrayList<Book> borrowedBooks; 
	private static final int MAX_BORROW_LIMIT = 3; 
	
	
	public User(String name, String id) {
		super(name, id); 
		borrowedBooks = new ArrayList<>(); 
	}
	
	public int getAmountOfBooks() {
		return borrowedBooks.size(); 
	}
	
	
	public boolean canBorrow() {
		return borrowedBooks.size() < MAX_BORROW_LIMIT; 
	}
	
	public void borrowBook(Book book) {
		if(canBorrow()){
			borrowedBooks.add(book); 
		}
		else {
			System.out.println("You have reached the maximum amount of books that can be borrowed"); 
			
		}
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book); 
	}
	
	public void booksCheckedOut() {
		System.out.println("Books checked out: "); 
		for(int i = 0; i < borrowedBooks.size(); i++) {
			Book book = borrowedBooks.get(i); 
			System.out.println(book.getTitle()); 
		}
	}
	
	public ArrayList<Book> getBorrowedBooks(){
		return borrowedBooks; 
	}

}
