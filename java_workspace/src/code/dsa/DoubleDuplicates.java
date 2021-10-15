package code.dsa;

import java.util.ArrayList;
import java.util.List;

public class DoubleDuplicates {
    public static void main(String[] args) {
        int a[] = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates(a, a.length).forEach(System.out::println);
    }

    public static List<Integer> findDuplicates(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                list.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return list;
    }
}
