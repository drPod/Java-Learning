import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
    
        Scanner console = new Scanner(System.in);
        
        System.out.println("What Digits would you like to find the sum of? ");
        String ogDigits = console.nextLine();
        
        int length = ogDigits.length();
        
        int totalSum = 0;
        int temp = 0;
        for (int i=0; i < length; i++) {
        
            temp = Integer.parseInt(ogDigits.substring(i, i + 1));
            totalSum = totalSum + temp;
        
        }
        
        System.out.println("The sum of the digits you inputted are " + totalSum);
    
    }

}