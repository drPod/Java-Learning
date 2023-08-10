import java.util.Scanner;

public class CountingNumbers {

    public static void main(String[] args) {
    
        Scanner console = new Scanner(System.in);
        
        System.out.print("What number should I count to? ");
        int highestNum = console.nextInt();
        
        highestNum++;
        
        int i = 1;
        while (i != highestNum) {
        
            System.out.println(i);
            i++;
        
        }
    
    }

}