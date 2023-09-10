import java.util.Scanner;
/**
 * @author (Darsh)
 */
public class StringMethods
{
    /**
     * Constructor for objects of class StringMethods
     */
    
    public StringMethods()
    {
        int idek = 21;
    }
    
    public void unusualHello(String name) {
    
        System.out.println("Hello " + name + ", you dummy!");
    
    }
    
    public String stringRipper(String str) {
    
        String x = str.substring(0,1);
        String y = str.substring(str.length() - 1);
        
        return x + y;
    
    }
    
    public void concatenate(String a, String b, boolean c) {
    
        if (c == true) {
            System.out.println(a + " " + b);
        }
        else {
            System.out.println(a + b);
        }
        
    }
    
    public boolean hasSub(String str, String sub) {
    
        int subLength = sub.length();
        for (int i = 0; i < str.length(); i++) {
        
            if (i + subLength > str.length()) {break;}
            // cause the last few strings return an indexOutOfBounds error
            
            String temp = str.substring(i, sub.length() + i);
            if (temp.equals(sub) == true) {
                return true;
            }
        
        }
        return false; // if the loop ends, then it returns false
    
    } 
    
    public boolean evenFooBar(String str) {
        
        int strLength = str.length();
        int fooCounter = 0;
        int barCounter = 0;
        
        for (int i = 0; i < strLength; i = i + 3) {
        
            String idk = str.substring(i, i+3);
            boolean temp = idk.equals("foo");
            if (temp) {
                fooCounter++;
            }
            else {
                barCounter++;
            }

        }
        return barCounter == fooCounter;
    }
    
    public String microwaveTime(String str) {
        switch (str.length()) {
        
            case 1:
                return "0:0" + str;
            case 2:
                return "0:" + str;
            case 3:
                String x = str.substring(0, 1);
                String y = str.substring(1, 2);
                String z = str.substring(2);
                return x + ":" + y + z;
            case 4:
                String a = str.substring(0 ,1);
                String b = str.substring(1, 2);
                String c = str.substring(2, 3);
                String d = str.substring(3);
                return a + b + ":" + c + d;
            default:
                return "invalid input";
        
        }
    }
    
    public String reverseWords(String str) {
        String[] a = str.split(" ");
        String b = "";
        for (int i = 0; i < a.length; i++) {
            b = a[i] + " " + b;
        }
        return b;
    }
    
    public int sumString(String str) {
        Scanner x = new Scanner(str);
        String count = "";
        while (x.hasNext()) {
            if (x.hasNextInt()) {
                count = count + x.nextInt();
            }
            else {
                x.next();
            }
        }
        return count.length();
    }
        
}
