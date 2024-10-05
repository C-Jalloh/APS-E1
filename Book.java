public class Book {

    private String title;
    private String author;
    private int yearPublished;

// constructor
    public Book(){}
    public Book( String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void tostring(){
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Year: " + this.yearPublished);
    }

    public void display() {
        System.out.println("\n\t Title : " + this.getTitle()  + "\n\t Author : " + this.getAuthor() + "\n\t Year Published : " + this.getYearPublished());

    }
}
