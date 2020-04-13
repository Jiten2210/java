package code.leet_code.easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer a[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicateElements(a) + "=== " + removeDuplicates(a));
    }

    private static int removeDuplicates(Integer[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[j++] = nums[i];
        }

        return j;
    }

    private static int removeDuplicateElements(Integer[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
