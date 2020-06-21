package code.leet_code.easy;

import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 5, 7, 12, 17};
        Arrays.stream(targetSum(a, 22))
                .forEach(index-> System.out.print(index + " "));

    }
    public static int[] targetSum(int[] a, int target) {
        int left= 0, right = a.length -1;
        while(left < right)
        {
            int currentSum = a[left] + a[right];
            if(currentSum == target)
                return new int[] { left, right};
            if(target > currentSum)
                left++;
            else
                right--;

        }
        return  new int[] {-1, -1};
    }
}
