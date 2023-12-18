import java.util.ArrayList;

public class Animal {
    
    private String name;
    private int birthYear;
    private ArrayList<Toy> listOfToys;
    private Animal friend;
    private static int currentYear = 2023;
    
    public Animal() {}
    public Animal(String n, int b) {
        name = n;
        birthYear = b;
        listOfToys = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public int getBirthYear() {
        return birthYear;
    }
    
    public void addToy(Toy a) {
        listOfToys.add(a);
    }
    
    public void setFriend(Animal a) {
        friend = a;
    }
    
    public int getAge() {
        return currentYear - birthYear;
    }
    
    public String toString() {
        if (friend
        return "Hello, I am " + name + ". I am " + currentYear - birthYear + " years old."
    }
}