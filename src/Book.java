public class Book {
    Author author;
    private String title;
    private int yearOfPublishing;
    String publisher;
    int pageAmount;

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
}
