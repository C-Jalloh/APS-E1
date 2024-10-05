import java.util.Scanner;

public class Library {

    private Book[] collection;
    private int count = 0;

    // constructor
    public Library() {
        this.collection = new Book[5];
    }


    public void addBook(Book book) {

        ;
        System.out.println(count);
        if (count >= 5) {
            System.out.println("You cannot add anymore books");
        } else {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the book's title ");
            String title = in.nextLine();
            System.out.println("Enter the book's author:  ");
            String author = in.nextLine();
            System.out.println("Enter the year the book was published: ");
            int year = 0;
            boolean validYear = false;
            while (!validYear) {
                if (in.hasNextInt()) {
                    year = in.nextInt();
                    validYear = true;
                } else {
                    System.out.println("Invalid input! Please enter an integer for the year: ");
                    in.next(); // consume the invalid input
                }
            }
            book = new Book(title, author, year);
            collection[count] = book;
            count++;


        }
    }

    public void displayBooks() {

        if (count== 0) {
            System.out.println("No books to display.");
        } else {
            for (int i = 0; i < count; i++) {
                Book s = collection[i];
                System.out.println("\n\t Title : " + s.getTitle() + "\n\t Author : " + s.getAuthor() + "\n\t Year Published : " + s.getYearPublished());
            }
        }


    }


    public void findBooksByAuthor(String author) {
        if (collection.length == 0) {
            System.out.println("No books to search.");
        } else {
            for (int i = 0; i < count; i++) {
                Book s = collection[i];

                if(s.getAuthor().equals(author)){
                    s.display();
                }
            }
        }
    }
}
