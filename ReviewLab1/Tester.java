import java.util.Scanner;

public class Tester {
    
    public static void main(String[] args) {
        
        System.out.println("Hello again, world!");
        // The above statement prints "Hello again, world"
        
        int numapples = 1;
        final double PRICE_OF_APPLE = 0.77;
        
        int numApples = 6;
        System.out.println("The price of the apples is " + PRICE_OF_APPLE * numApples );
        
        if (PRICE_OF_APPLE * numApples > 20.00) {
            
            System.out.println("Thank you customer!");
            
        }
        
        for (int i = 1; i < 13; i++) {
            
            System.out.print(i + " ");
            
        }
        System.out.println("");
        
        int temp = 1;
        for (int i = 1; i <=9; i++) {
            
            temp = i;
            temp = temp * temp;
            System.out.print(temp + " ");
            
        }
        System.out.println("");
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = console.nextLine();
        System.out.println(lengthOfName(name));
        
        int i = 0;
        int sumOfNumbers = 0;
        int counter = 0;
        do {
            
            System.out.print("Enter a number: ");
            i = console.nextInt();
            sumOfNumbers = sumOfNumbers + i;
            counter++;
            
        }
        while (i != 0);
        counter = counter - 1; // To account for the last 0 added
        System.out.println("The sum is " + sumOfNumbers + " and the average of the numbers is " + sumOfNumbers / counter);
        
        double[] areas;
        areas = new double[9];
        areas[0] = 4.56;
        
        int length = areas.length;
        areas[length - 1] = 8.08;
        
        boolean[] bool = { true, true, false, false, true };
        
        String monkey = "monkey";
        String bigMonkey = "bigMonkey";
        
        System.out.println(longerString(monkey, bigMonkey));
        System.out.println(capsAlter(monkey));
    }
    // End of main method
    
            public static int lengthOfName(String x) {
            
            return(x.length());
            
        }
        
        public static void printMethod() {
            
            System.out.println("This is a method!");
            
        }
        
        public static int sumOfIntegers(int x, int y) {
            
            return(x + y);
            
        }
        
        public static String longerString(String x, String y) {
            
            if (((x.length() > y.length()))) {
                
                return(x);
                
            }
            else {
                
                return(y);
                
            }
            
        }
            
        public static String capsAlter(String x) {
             
            String result = "";  
            for (int i = 0; i < x.length(); i++) {
                    
                if (Character.isLetter(x.charAt(i))) {
                    
                    if (i % 2 == 0) {
                        
                        result += x.substring(i, i+1).toLowerCase();
                    
                    }
                    else {
                        
                        result += x.substring(i, i+1).toUpperCase();
                        
                    }
                        
                }
                    
            }
            
            return(result);
                
        }
    
}