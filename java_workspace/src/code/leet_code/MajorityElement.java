package code.leet_code;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = 0, count = 0;
        System.out.println(findMajorityOptimalApproach(nums) + " ----> " + findMajorityBruteForce(nums));
    }

    private static int findMajorityOptimalApproach(int[] nums) {
        int result = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count = 1;
            } else if (result == nums[i]) count++;
            else count--;
        }
        return result;
    }

    private static int findMajorityBruteForce(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
