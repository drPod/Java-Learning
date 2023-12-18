import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Cemetery {
    private ArrayList<Tombstone> tombstone;
    private String name;
    private String burial;
    private String address;
    private int age;

    public Cemetery(String fileName) throws IOException {
        // ArrayList<Tombstone> tombstone = new ArrayList<>();
        tombstone = new ArrayList<>();

        Scanner x = new Scanner(new File(fileName));

        while (x.hasNextLine()) {
            Scanner y = new Scanner(x.nextLine());
            for (int i = 0; y.hasNext(); i++) {

                name = "";
                burial = "";
                address = "";
                age = 0;

                while (!y.hasNextInt()) {
                    name = name + " " + y.next();
                }

                burial = y.next();
                for (int j = 0; j < 2; j++) {
                    burial = burial + " " + y.next();
                }

                age = parseAge(y.next());
                address = y.nextLine();

            }
            tombstone.add(new Tombstone(name, burial, address, age));

        }

    }
}
