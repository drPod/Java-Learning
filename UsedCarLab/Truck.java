public class Truck extends Vehicle {

    private int towing; // as in towing capacity
    
    public Truck(String typ, int yea, double pric, int d) {
        super(typ, yea, pric);
        towing = d;
    }
    
    public boolean canTowBoat() {
        if (towing >= 2000) {
            return true;
        }
        return false;
    }
    
    /* public String toString() {
        return getYear() + " " + getType() + ", " + towing + " lbs. towing, $" + getPrice();
    } */
    
    public String toString() {
        return super.toString() + ", " + towing + " lbs. towing";
    }
}