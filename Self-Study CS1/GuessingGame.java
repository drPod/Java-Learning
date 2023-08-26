import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
    
        Scanner console = new Scanner(System.in);
        Random randoConsole = new Random();
        
        System.out.println("How far should the guessing range be?");
        int range = console.nextInt();
        
        int randomNumber = randoConsole.nextInt(range);
        randomNumber++;
        
        System.out.println("Guess a number: ");
        int guessedNumber = console.nextInt();
        
        if (guessedNumber == randomNumber) {
        
            System.out.println("You guessed correctly.");
        
        }
        else {
        
            System.out.println("You guessed incorrectly. The correct number is " + randomNumber);
        
        }
    
    }

}