public class Tombstone
{
    private String name;
    private int burialDate;
    private int age;
    private String address;
    
    public Tombstone(String n, int b, int a, String ad) {
        name = n;
        burialDate = b;
        age = a;
        address = ad;
    }
    
    public String getName() {
        return name;
    }
    
    public int getBurialDate() {
        return burialDate;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
}
