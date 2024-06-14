import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {
        double[] myList = new double[3];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            myList[i] = keyboard.nextDouble();
        }

        // Before Random shuffling
        System.out.println("Before Random shuffling " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Value %d: %.2f\n", (i + 1), myList[i]);
        }

        // Before Random shuffling
        for (int i = myList.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        System.out.println("After Random shuffling " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Value %d: %.2f\n", (i + 1), myList[i]);
        }
    }
}