import java.util.ArrayList;

public class Animal {

    private String name;
    private int birthYear;
    private ArrayList<Toy> listOfToys;
    private boolean doesFriendExist;
    private Animal friend;
    private static int currentYear = 2023;

    public Animal() {
    }

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
        doesFriendExist = true;
    }

    public int getAge() {
        return currentYear - birthYear;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < listOfToys.size(); i++) {
            output = output + " " + listOfToys.get(i);
        }
        if (doesFriendExist) {
            return "Hello, I am " + name + ". I am " + currentYear - birthYear + " years old. My friend is "
                    + friend.getName() + "." + " I have the following toys: " + output + ". ";
        }
        return "Hello, I am " + name + ". I am " + currentYear - birthYear + " years old. "
                + "I have the following toys: " + output + ". ";
    }
}