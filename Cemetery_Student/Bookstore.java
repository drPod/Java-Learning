import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> inventory;

    public Bookstore() {
    }

    public Bookstore(ArrayList<Book> x) {
        inventory = x;
    }

    public void addBook(Book b) {
        inventory.add(b);
    }

    public int numBooks() {
        return inventory.size();
    }

    public Book getBook(int index) {
        if (index < 0 || index >= inventory.size()) {
            return null;
        }

        return inventory.get(index);
    }

    public double bookstoreValue(Bookstore store) {
        double output = 0;
        for (int i = 0; i < store.numBooks(); i++) {
            output = output + store.getBook(i).getPrice();
        }
        return output;
    }
}
