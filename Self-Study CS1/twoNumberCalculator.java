import java.util.Scanner;

public class twoNumberCalculator {

    public static void main (String[] args){
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("What's the first number you would like the operation to be performed on?");
        int num1 = console.nextInt();
        
        // Consume the newline character left in the buffer
        console.nextLine();
        
        System.out.println("Would you like to add, subtract, multiply, or divide? Answer with (+,-,*,/)");
        String operation = console.nextLine();
        
        System.out.println("What's the second number you would like the operation to be performed on?");
        int num2 = console.nextInt();
        
        int num3;
        
        System.out.println(operation);
        
        if (operation.equals("+")) {
            
            num3 = num1 + num2;
            System.out.println("The result of the math operation is " + num3);
            
        }
        else if (operation.equals("-")) {
        
            num3 = num1 - num2;
            System.out.println("The result of the math operation is " + num3);
        
        }
        else if (operation.equals("*")) {
        
            num3 = num1 * num2;
            System.out.println("The result of the math operation is " + num3);
        
        }
        
        else if (operation.equals("/")) {
        
            num3 = num1 / num2;
            System.out.println("The result of the math operation is " + num3);
        
        }
        else {
        
            System.out.println("Input not recognized");
        
        }
                
        console.close();
        
    }
    
}