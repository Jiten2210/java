package code.dsa;

import java.util.Arrays;

public class LeastTripletSum {
    public static void main(String[] args) {
        System.out.println(searchTriplet(new int[]{-2, 0, 1, 2}, 2));
    }

    private static int searchTriplet(int[] nums, int targetSum) {
        Arrays.sort(nums);
        int leastDifference = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int targetDiff = targetSum - nums[i] - nums[left] - nums[right];
                if (targetDiff == 0) return targetSum - targetDiff;

                if (Math.abs(targetDiff) < Math.abs(leastDifference) || Math.abs(targetDiff) == Math.abs(leastDifference) && targetDiff > leastDifference)
                    leastDifference = targetDiff;

                if (targetDiff > 0) left++;
                else right--;
            }

        }

        return targetSum - leastDifference;
    }
}
