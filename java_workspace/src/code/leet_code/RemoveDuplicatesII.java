package code.leet_code;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        Integer a[] = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicateElements(a));
    }

    private static int removeDuplicateElements(Integer[] nums) {

        if (nums.length == 0) return 0;

        int i = 1;
        for (int j = 0; j < nums.length -2; j++) {
            if (nums[j] != nums[j+2]) {
                nums[i++] = nums[j];
            }
        }
        return i + 1;
    }
}
