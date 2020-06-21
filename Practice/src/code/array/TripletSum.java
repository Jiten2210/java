package code.array;

import java.util.Arrays;
import java.util.HashSet;

public class TripletSum {
    public static void main(String[] args) {
        int a[] = {1, 4, 45, 6, 10, 8, 19};
        int n = a.length;
        findThreeSum(a, n, 24);
        findTripletSum(a, n, 24);
    }

    private static void findTripletSum(int[] a, int n, int sum) {
        Arrays.sort(a);
        for (int i = 0; i < n - 3; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (a[i] + a[left] + a[right] == sum) {
                    System.out.println("\n Numbers are: " + a[i] + " " + a[left] + " " + a[right]);
                    break;
                } else if (a[i] + a[left] + a[right] < sum)
                    left++;

                else
                    right--;
            }

        }
    }

    static boolean findThreeSum(int a[], int arr_size, int sum) {
        for (int i = 0; i < arr_size - 2; i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            int currentSum = sum - a[i];
            for (int j = i + 1; j < arr_size; j++) {
                if (set.contains(currentSum - a[j])) {
                    System.out.printf("Numbers are %d, %d, %d", a[i],
                            a[j], currentSum - a[j]);
                    return true;
                }
                set.add(a[j]);
            }
        }
        return false;
    }
}