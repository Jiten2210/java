package code.dsa;

public class ProductDifference {
    public static void main(String[] args) {
        int nums[] = {5, 6, 2, 7, 4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        int c = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current > a) {
                b = a;
                a = current;
            } else if (current > b) {
                b = current;
            }

            if (current < d) {
                c = d;
                d = current;
            } else if (current < c) {
                c = current;
            }
        }

        return a * b - c * d;
    }
}
