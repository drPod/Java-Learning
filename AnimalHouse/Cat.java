public class Cat extends Animal {
    private int numLives;

    public Cat(String name, int birthYear) {
        super(name, birthYear);
        numLives = 9;
    }

    public Cat(String name, int birthYear, int numLives) {
        super(name, birthYear);
        this.numLives = numLives;
    }

    public int getLives() {
        return numLives;
    }

    public String toString() {
        return super.toString() + "I have " + numLives;
    }

}
