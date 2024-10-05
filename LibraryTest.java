import java.util.Scanner;

public class LibraryTest {

    public static void main(String[] args) {


    Library library = new Library();
    Scanner scanner = new Scanner(System.in);
    int choice;
   do

    {
        System.out.println("Menu:");
        System.out.println("1. Add a new Book");
        System.out.println("2. Display all books");
        System.out.println("3. Find book by author");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter an integer: ");
            scanner.next();
        }

        choice = scanner.nextInt();

        String input = scanner.nextLine(); // consume newline
        Book book = new Book();

        switch (choice) {
            case 1:
                library.addBook(book);
                break;
            case 2:
                library.displayBooks();
                break;
            case 3:
                System.out.println("Whats the name of the author");
                String author = scanner.nextLine();
                library.findBooksByAuthor(author);
                break;
            case 4:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
   while(choice !=4);
   scanner.close();

}
}
