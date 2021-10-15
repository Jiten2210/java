package code.dsa;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        int left, right;
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                left = j + 1;
                right = n - 1;

                while (left < right) {
                    if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] < target)
                        left++;
                    else right--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}