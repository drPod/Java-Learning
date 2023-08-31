public class Tester
{
    public static void main(String[] args)
    {
        Player player = new Player();
        player.setName("John");
        player.setNumber(66);
        System.out.println(player.toString());
        
        player = new Player("Jack", 54);
        System.out.println(player.toString());
    }
}