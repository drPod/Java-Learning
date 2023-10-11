public class ArrayLoopingPractice {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4 };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\n");

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\n");

        for (int i = 1; i <= a.length; i++) {
            System.out.print(a[i - 1]);
        }
        System.out.print("\n");

        for (int i = a.length; i > 0; i--) {
            System.out.print(a[i - 1]);
        }
        System.out.print("\n");

        for (int i = a.length; i >= 1; i--) {
            System.out.print(a[i - 1]);
        }
        System.out.print("\n");

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.print("\n");

        for (int i = a.length - 1; i > -1; i--) {
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }
}