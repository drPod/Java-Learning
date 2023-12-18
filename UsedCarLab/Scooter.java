public class Scooter extends Vehicle {
    
    private String material;
    
    public Scooter(String typ, int yea, double pric, String material) {
        super(typ, yea, pric);
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public String toString() {
        return super.toString() + " " + material;
    }
}