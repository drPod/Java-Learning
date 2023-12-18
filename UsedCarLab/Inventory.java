import java.util.ArrayList;

public class Inventory {
    
    /* private ArrayList<Car> cars;
    private ArrayList<Truck> trucks; */
    private ArrayList<Vehicle> inventory;
    
    public Inventory() {
        inventory = new ArrayList<>();
    }
    
    /* public void addCar(Car c) {
        cars.add(c);
    }
    
    public void addTruck(Truck t) {
        trucks.add(t);
    }
    
    public void listInventory() {
        for (Car i : cars) {
            System.out.println(i.toString());
        }
        for (Truck j : trucks) {
            System.out.println(j.toString());
        }
    } */
    
    public void addVehicle(Vehicle v) {
        inventory.add(v);
    }
    
    public void listInventory() {
        for (Vehicle i : inventory) {
            System.out.println(i.toString());
        }
    }
    
}