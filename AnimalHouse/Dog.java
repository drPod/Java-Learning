public class Dog extends Animal {
    private boolean goodBoy;

    public Dog(boolean goodBoy) {
        super();
        this.goodBoy = goodBoy;
    }

    public String toString() {
        if (goodBoy) {
            return super().toString() + "I am a good boy.";
        }
        else {
            return super().toString() + "I am a bad boy.";
        }
    }
}