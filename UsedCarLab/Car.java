public class Car extends Vehicle {
    
    private double mpg;
    
    public Car(String typ, int yea, double pric, double d) {
        super(typ, yea, pric);
        mpg = d;
    }
    
    public boolean greatGasMileage() {
        if (mpg >= 36) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /* public String toString() {
        return getYear() + " " + getType() + ", " + mpg + " mpg, $" + getPrice();
    } */
    
    public String toString() {
        return super.toString() + ", " + mpg + " mpg";
    }
}