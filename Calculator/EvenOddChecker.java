import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num1 = console.nextInt();
        System.out.println("You inputted " + num1);
        
        int num2 = num1 / 2;
        
        if (num2 * 2 == num1) {
            
            System.out.println("The number is even.");
            
        }
        
        else {
            
            System.out.println("The nubmer is odd.");
            
        }
        
    }
}