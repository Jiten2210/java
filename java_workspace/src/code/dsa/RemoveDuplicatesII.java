package code.dsa;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        Integer nums[] = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int begin = 2;
        int count = 2;

        while (begin < nums.length) {
            if (nums[begin] != nums[count - 2]) nums[count++] = nums[begin];
            begin++;
        }
        System.out.println(count);
    }

}
