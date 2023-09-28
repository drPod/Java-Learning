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
        int tempDiff = 0;
        int permDiff = 0;
        for (int i = bids.length - 1; i > 0; i--) {
            if (bids[i] == price) {return bids[i];}
            bids[i] = 
        }
        return 0;
    }
}