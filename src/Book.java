import java.util.Objects;

public class Book {

    private Author author;
    private String title;
    private int yearOfPublishing;
    private String publisher;
    private int pageAmount;

    public Book(String title, Author author, int yearOfPublishing, int pageAmount, String publisher) {
        this.yearOfPublishing = yearOfPublishing;
        this.publisher = publisher;
        this.pageAmount = pageAmount;
        this.title = title;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String toString() {
        return this.author +", "+ this.title + ", " +this.yearOfPublishing +", "+ this.pageAmount + ", " + this.publisher;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getTitle(), book.getTitle());
    }

    public int hashCode() {
        return java.util.Objects.hash(getTitle());
    }
}