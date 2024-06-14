import java.util.Scanner;

public class ArrayExample1 {

    public static void main(String[] args) {

        double[] myList = new double[3];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            myList[i] = keyboard.nextDouble();
        }

        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Value %d: %0.2f\n", (i + 1), myList[i]);
        }
    }
}