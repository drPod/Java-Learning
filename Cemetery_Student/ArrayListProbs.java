import java.util.*;

public class ArrayListProbs {
    public void makeListAndPrint(int num, int limit) {
        ArrayList<Integer> x = new ArrayList<>();
        Random randomGen = new Random();
        for (int i = 1; i < limit; i++) {
            int y = randomGen.nextInt(limit) + 1;
            x.add(i, y);
        }
        System.out.println(x);
    }

    public ArrayList<Integer> minToFront(ArrayList<Integer> list) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (i < small) {
                i = small;
            }
        }
        list.add(0, small);
        return list;
    }

    public ArrayList<Integer> addOne(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i) + 1);
        }
        return list;
    }

    public ArrayList<String> removeDupes(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i);
            }
        }
        return list;
    }

    public ArrayList<Integer> swapPairs(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i = i + 2) {
            int first = list.get(i);
            int second = list.get(i + 1);
            list.set(i, second);
            list.set(i + 1, first);
        }
        return list;
    }

    public ArrayList<String> removeLenN(ArrayList<String> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == n) {
                list.remove(i);
            }
        }
        return list;
    }

    public int dumbestPerson(ArrayList<Person> list) {
        int dumb = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (dumb > list.get(i).getIQ()) {
                dumb = list.get(i).getIQ();
                index = i;
            }
        }
        return index;
    }

    public Book highestPricedBook(ArrayList<Book> list) {
        double high = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (high < list.get(i).getPrice()) {
                high = list.get(i).getPrice();
            }
        }
        int x = list.indexOf(high);
        return list.get(x);
    }

    public ArrayList<Book> banBook(ArrayList<Book> list, Book book) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(book)) {
                list.remove(i);
            }
        }
        return list;
    }
}
