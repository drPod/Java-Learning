import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
    
        Scanner console = new Scanner(System.in);
        
        System.out.println("Would you like to encrypt or decrypt a cipher? (1 for encrypt, 2 for decrypt)");
        int decision = console.nextInt();
        
        System.out.println("What is the cipher key?");
        int cipherKey = console.nextInt();
        
        console.nextLine();
        if (decision == 1){
        
            System.out.println("Enter the unencrypted phrase:");
            String unencrypted = console.nextLine();
            
        }
        
        console.close();
    
    }

}