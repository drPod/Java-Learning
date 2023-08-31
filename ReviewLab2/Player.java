public class Player {
    private String name;
    private int number;
    
    public Player(String str, int num) {
        name = str;
        number = num;
    }
    
    public Player() {
        name = "Default";
        number = -1;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setName(String str) {
        name = str;
    }
    
    public void setNumber(int num) {
        number = num;
    }
    
    public String toString() {
        String result = "Player: " + name + ", #" + number;
        return result;
    }
}