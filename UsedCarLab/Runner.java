import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Car x = new Car("Bugatti Aventador", 2055, 420, 99);
        Car y = new Car("Lamborghini Chiron", 1886, 532, 234);
        
        Truck a = new Truck("fefwa", 9482, 53245, 968);
        Truck b = new Truck("uyewaf", 329, 43985, 342);
        
        x.greatGasMileage();
        a.canTowBoat();
        y.toString();
        b.toString();
        
        Inventory t = new Inventory();
        
        /* t.addCar(x);
        t.addCar(y);
        t.addTruck(a);
        t.addTruck(b); */
        
        Scooter q = new Scooter("asdfg", 2389, 23432, "gergr");
        Scooter w = new Scooter("jtyjhtr", 21321, 234, "ergr");
        
        
        t.addVehicle(x);
        t.addVehicle(y);
        t.addVehicle(a);
        t.addVehicle(b);
        t.addVehicle(q);
        t.addVehicle(w);
        t.listInventory();
    }
}