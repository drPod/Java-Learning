/**
 * @author (Darsh)
 */ 
public class Runner
{

    public static void main(String[] args) {
    
        StringMethods test = new StringMethods();
        
        test.unusualHello("Ron");
        
        System.out.println(test.stringRipper("something"));
        
        test.concatenate("computer", "science", true);
        
        System.out.println(test.hasSub("Computer science", "sci"));
        
        /* System.out.println(test.evenFooBar(foofoobarbarfoo));
        System.out.println(test.evenFooBar(foobarbarfoo)); */
    
    }
    
}