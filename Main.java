public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "B001");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "B002");
        Book book3 = new Book("Dune", "Frank Herbert", "B003");

        User user1 = new User("Matthew", "U001");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addUser(user1);

        library.viewBooks();
        library.viewUsers();

        System.out.println();

        library.borrowBook(user1, "B001");
        library.borrowBook(user1, "B002");

        System.out.println();
        user1.booksCheckedOut();

        System.out.println();
        library.viewBooks();

        System.out.println();
        library.returnBook(user1, "B001");

        System.out.println();
        user1.booksCheckedOut();

        System.out.println();
        library.viewBooks();
    }
}