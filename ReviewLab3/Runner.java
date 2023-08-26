/**
 * @author (Darsh) 
 */
public class Runner {

    public static void main(String[] args) {
    
        System.out.println("\n ------------------\n"); // So I can tell this output apart from other ones
        
        Polynomial a = new Polynomial();
	a.setTerm(1.0, 2); a.setTerm(2.0, 1); a.setTerm(3.0, 0);

	System.out.println(a.evaluate(4.5)); //should print: 32.25
        System.out.println(a.toString() + "\n"); //should print: 1.0x^2 + 2.0x + 3.0
        
        a.setTerm(4.32, 2);
        a.setTerm(-2.12, 1);
        a.setTerm(3.67, 0);
        System.out.println(a.evaluate(2) + "\n");
        
        Polynomial b = new Polynomial();
        b.setTerm(-0.05, 2);
        b.setTerm(2.0, 1);
        b.setTerm(2.0, 0);
        System.out.println("Table that shows the concentrations of a new medicine in the bloodstream each hour for 8 hours:");
        for (int i = 1; i <= 8; i++) {
        
            System.out.print("Hour " + i + ": ");
            System.out.println(b.evaluate(i));
        
        }
        System.out.println("");
        
        Polynomial c = new Polynomial();
        c.setTerm(3.0, 0);
        c.setTerm(50.0, 1);
        c.setTerm(0.5 * 9.8, 2);
        System.out.println("Equation: " + c.toString());
        System.out.println("When the projectile passes 100m, the height is " + c.evaluate(100) + "m");
    
    }

}