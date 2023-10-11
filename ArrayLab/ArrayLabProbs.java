public class ArrayLabProbs {
    public void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public int lastIndexOf(int[] nums, int value) {
        int i;
        for (i = nums.length - 1; i > -1; i--) {
            if (value == nums[i]) {
                return i;
            }
        }
        return i;
    }

    public int range(int[] nums) {
        int y = nums[0];
        int z = nums[0];
        for (int x : nums) {
            if (y < x) {
                y = x;
            }
            if (z > x) {
                z = x;
            }
        }
        return y - z;
    }

    public int minDifference(int[] nums) {
        int output = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int diff1 = nums[i];
            int diff2 = nums[i + 1];
            int a = diff2 - diff1;
            if (Math.abs(a) < output) {
                output = a;
            }
        }
        return Math.abs(output);
    }

    public int priceIsRight(int[] bids, int price) {
        int closestBid = -1;
        for (int bid : bids) {
            if (bid <= price && bid > closestBid) {
                closestBid = bid;
            }
        }
        return closestBid;
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }
}