import java.util.Scanner;

public class Addition {
    public static void main(String args[]) {
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter a number to be added: ");
        int num1 = console.nextInt();
        System.out.println("You inputted " + num1);
        
        System.out.println("Enter a second number to be added: ");
        int num2 = console.nextInt();
        System.out.println("You inputted " + num2);
        
        int num3 = num1 + num2;
        
        System.out.println(num1 + " + " + num2 + " is " + num3);
        
    }
}