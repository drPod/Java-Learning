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
        System.out.println("");        
        System.out.println(test.evenFooBar("foofoobarbarfoo"));
        System.out.println("");
        System.out.println(test.evenFooBar("foobarbarfoo"));
        System.out.println("");
        
        System.out.println(test.microwaveTime("12"));
        System.out.println(test.microwaveTime("123"));
        System.out.println(test.microwaveTime("4500"));
        System.out.println("");
        
        System.out.println(test.reverseWords("hello world"));
        System.out.println(test.reverseWords("the sky is blue"));
        System.out.println("");
        
        System.out.println(test.sumString("Hi 5 there are 2 or 3 numbers in this String"));
    
    }
    
}
