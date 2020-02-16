package code.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 5, 7, 12, 1};
        Arrays.stream(twoSum(a, 9))
                .forEach(e -> System.out.print(e + " "));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (hm.containsKey(number)) {
                return new int[]{hm.get(number), i};
            }
            hm.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
