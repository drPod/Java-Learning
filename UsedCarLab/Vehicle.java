public class Vehicle
{
    // instance variables - replace the example below with your own
    private String type;
    private int year;
    private double price;
    
    public Vehicle(String typ, int yea, double pric) {
        type = typ;
        year = yea;
        price = pric;
    }
    
    public String getType() {
        return type;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return year + " " + type + " $" + price;
    }
}
