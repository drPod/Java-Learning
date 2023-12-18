import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayListProbs a = new ArrayListProbs();

        // 3
        a.makeListAndPrint(10, 50);

        // 4
        ArrayList<Integer> prob4 = new ArrayList<Integer>(Arrays.asList(2, 4, -5, 3));
        System.out.println(a.minToFront(prob4));
        // 5
        ArrayList<Integer> prob5 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        System.out.println(a.addOne(prob5));
        // 6
        System.out.println(a.removeDupes(new ArrayList<String>(Arrays.asList("to", "to", "be", "be", "or", "not"))));
        // 7
        System.out.println(a.swapPairs(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))));
        // 8
        System.out.println(a.removeLenN(new ArrayList<String>(Arrays.asList("wow", "hello", "world", "omg")), 3));
        // 10
        Person p1 = new Person("Rita", 150);
        Person p2 = new Person("Ron", 100);
        Person p3 = new Person("Ronda", 120);
        ArrayList<Person> prob10 = new ArrayList<Person>(Arrays.asList(p1, p2, p3));
        System.out.println(a.dumbestPerson(prob10));
        // 12
        System.out
                .println(a
                        .highestPricedBook(new ArrayList<Book>(Arrays.asList(new Book("Book 1", "Author 1", 12.99),
                                new Book("Book 2", "Author 2", 15.99), new Book("Book 3", "Author 3", 9.99))))
                        .toString());
        // 13
        System.out.println(a.banBook(
                new ArrayList<Book>(Arrays.asList(new Book("Book 1", "Author 1", 12.99),
                        new Book("Book 2", "Author 2", 15.99), new Book("Book 3", "Author 3", 9.99))),
                new Book("Book 1", "Author 1", 12.99)));

        Bookstore store = new Bookstore();
        store.addBook(new Book("Book 1", "Author 1", 12.99));
        store.addBook(new Book("Book 2", "Author 2", 15.99));
        store.addBook(new Book("Book 3", "Author 3", 9.99));
        // 15
        // System.out.println(store.bookstoreValue());
    }
}
