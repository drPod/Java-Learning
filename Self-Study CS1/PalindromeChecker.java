import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
    
        Scanner console = new Scanner(System.in);
        
        System.out.println("What word would you like me to check for a palindrome?");
        String userInput = console.nextLine();
        
        int inputLength = userInput.length();
        System.out.println(inputLength);
        
        String temp;
        for (int i = 0; i < inputLength; i++) {
        
            temp = userInput.substring(i,i + 1);
            System.out.println(temp);
        
        }
    
    }

}