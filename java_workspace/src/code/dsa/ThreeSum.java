package code.dsa;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) left++;

                else right--;
            }
        }
        return new ArrayList<>(result);
    }
}

