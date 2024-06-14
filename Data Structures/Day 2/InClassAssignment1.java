public class InClassAssignment1 {

    public static void main(String[] args) {
        // Problem 1: Initialize Array with input values
        int[] myList = new int[5];
        myList = new int[] { 1, 2, 3, 4, 5 };

        // Problem 2: Display the contents of the array
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Value %d: %d\n", (i + 1), myList[i]);
        }
        // Problem 3: Summing all elements: use the same array as in problem 1 and store
        // the sum of the values in a variable called total and display the total
        int total = 0; // initialize total to 0
        for (int i = 0; i < myList.length; i++) {
            total += myList[i]; // add the current element to total
        }
        System.out.printf("Total: %d\n", total);

        // Problem 4: Finding the largest element: use the array in problem 1
        int largest = myList[0]; // initialize largest to the first element
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > largest) {
                largest = myList[i]; // update largest if the current element is greater
            }
        }
        System.out.printf("Largest: %d\n", largest);

        // Problem 5: Find the smallest index of the larget element in the array
        int smallestIndex = 0; // initialize smallestIndex to 0
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > myList[smallestIndex]) {
                smallestIndex = i; // update smallestIndex if the current element is greater
            }
        }
        System.out.printf("Smallest Index: %d\n", smallestIndex);

        // Problem 6: Random shuffling (see ArrayExample2.java)
        for (int i = 0; i < myList.length; i++) {
            int randomIndex = (int) (Math.random() * myList.length);
            int temp = myList[i];
            myList[i] = myList[randomIndex];
            myList[randomIndex] = temp;
        }
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Value %d: %d\n", (i + 1), myList[i]);
        }

        // Problem 7: Shifting elements
        int temp = myList[myList.length - 1]; // store the last element in temp
        for (int i = myList.length - 1; i > 0; i--) {
            myList[i] = myList[i - 1]; // shift elements to the right
        }
        myList[0] = temp; // move the last element to the first
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("Value %d: %d\n", (i + 1), myList[i]);
        }

    }
}