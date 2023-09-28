public class Runner {
    public static void main(String[] args) {
        ArrayLabProbs x = new ArrayLabProbs();
        x.triangle(7);
        System.out.print("\n");

        System.out.println(
                x.lastIndexOf(new int[] { 8, 2, 4, 6, 8 }, 8));
        System.out.println(
                x.lastIndexOf(new int[] { 2, 4, 6, 12 }, 8));
        System.out.print("\n");

        System.out.println(
                x.range(new int[] { 8, 3, 5, 7, 2, 4 }));
        System.out.println(
                x.range(new int[] { 15, 22, 8, 19, 31 }));
        System.out.println(
                x.range(new int[] { 100, 5 }));
        System.out.print("\n");

        System.out.println(
                x.minDifference(new int[] { 4, 8, 6, 1, 5, 9, 4 }));
    }
}