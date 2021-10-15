package code.dsa;

import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 1, 7, 9, 12, 4, 8, 0};
        int num = 5;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.containsKey(num - arr[i])) {
                count++;
            } else
                hs.put(arr[i], 1);
        }
        System.out.println(count);
    }
}