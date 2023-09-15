import java.util.Scanner;
/**
 * @author (Darsh)
 */
public class SecretCode
{
    // instance variables - replace the example below with your own
    private String key;
    private String code;

    /**
     * Constructor for objects of class SecretCode
     */
    public SecretCode(String k, String c)
    {
        // initialise instance variables
        key = k;
        code = c;
    }

    public String decode() {
        Scanner x = new Scanner(code);
        String count = "";
        while (x.hasNext()) {
            if (x.hasNextInt()) {
                int y = x.nextInt();
                System.out.print(key.substring(y, y + 1));
            }
            else {
                x.next();
            }
        }
        return count;
    }
}
