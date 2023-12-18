public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String x, String y, double z) {
        title = x;
        author = y;
        price = z;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return title + ", by " + author + ". Cost: $" + price;
    }
}
