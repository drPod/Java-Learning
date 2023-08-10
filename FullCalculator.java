import java.util.Scanner;

public class FullCalculator {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("How many numbers would you like to perform an operation on?");
        int numOperations = console.nextInt();
        
        int[] numbers = new int[numOperations];
        
        System.out.println(numOperations);
        
        for (int i = 1; i == numOperations; i++) {
        
            System.out.println("Number " + i + ": ");
            int temp = console.nextInt();
            numbers[i] = temp;
        }
        
    }

}