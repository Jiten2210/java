package code.array;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        Arrays.sort(arr);
        int sum = 24;
        for (int i = 0; i < arr.length - 3; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == sum) {
                    System.out.println("Numbers are:" + arr[i] + " " + arr[l] + " " + arr[r]);
                    break;
                } else if (arr[i] + arr[l] + arr[r] < sum)
                    l++;

                else
                    r--;
            }

        }
    }
}