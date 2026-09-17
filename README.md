# Library Management System

A Java console application for managing a small library. It keeps track of books and handles the loans that link books to the people who borrow them.

This project was built as a way to practice core Java concepts — object-oriented design, working with collections, and organizing a program across multiple classes.

## Features

- Store and manage a catalog of books
- Check books out as loans and return them
- Keep book details and loan records organized through dedicated classes
- Simple, dependency-free console program that runs anywhere Java does

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed

### Running the Project

Clone the repository:

```bash
git clone https://github.com/CLUJMAN/Library-.git
cd Library-
```

Compile and run from the command line:

```bash
javac *.java
java Main
```

Or open the project directly in Eclipse (**File → Import → Existing Projects into Workspace**) and run `Main.java`.

## Project Structure

| File | Description |
|------|-------------|
| `Main.java` | Entry point that starts and drives the program |
| `Library.java` | Core class that manages the collection of books and active loans |
| `Book.java` | Represents a single book and its details |
| `Loan.java` | Represents a loan, linking a borrowed book to a borrower |

## Built With

- Java (standard library only — no external dependencies)

## Future Improvements

- Save and load library data to a file so records persist between runs
- Add search and filtering to find books quickly
- Track due dates and flag overdue loans
- Build a graphical interface on top of the existing logic

## Author

**CLUJMAN**

## License

This project is free to use and modify for learning purposes.
