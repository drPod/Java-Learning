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
    
    /* public boolean evenFooBar(String str) {
        
        int strLength = str.length();
        int fooCounter;
        int barCounter;
        
        for (int i = 0; i < strLength; i++) {
        
            

        }
        
    } */
        
}