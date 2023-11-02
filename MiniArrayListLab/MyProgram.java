import java.util.ArrayList;

public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        
        x.add(1);
        x.add(4);
        x.add(2);
        x.add(6);
        x.add(8);
        x.add(9);
        
        System.out.println(x);
        
        x.clear();
        x.add(0, 9);
        x.add(0, 8);
        x.add(0, 6);
        x.add(0, 2);
        x.add(0, 4);
        x.add(0, 1);
        System.out.println(x);
        
        for (int i = x.size() - 1; i > -1; i--) {
            if (i == x.size() - 1) {
                System.out.print(x.get(i));
            }
            else {
                System.out.print(x.get(i) + ", ");
            }
        }
        System.out.println("\n");
        
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Sam");
        names.add("I");
        names.add("Am");
        names.add("Green");
        names.add("Eggs");
        System.out.println(names);
        
        for (int i = 0; i < names.size(); i++) {
            if (i == x.size() - 1) {
                System.out.print(names.get(i));
                System.out.print("\n");
            }
            else {
                System.out.print(names.get(i) + ", ");
            }
        }
        
        for (String name : names) {
            if (names.indexOf(name) == names.size() - 1) {
                System.out.print(name);
                System.out.print("\n");
            }
            else {
                System.out.print(name);
            }
        }
        
        ArrayList<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(5);
        values.add(1);
        values.add(7);
        values.add(9);
        values.add(11);
        values.add(12);
        
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) % 2 == 1) {
                values.set(i, values.get(i) * 2);
            }
        }
        System.out.println(values);
        
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) < 6) {
                values.remove(i);
            }
        }
        System.out.println(values);
        
        // [I, Do, Not, Green, Like, Eggs, I, Am, Sam]
    }
}
