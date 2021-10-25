package code.dsa;

import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("john");
        System.out.println(s1);
        int[] arr = {2,3,11,2};
        int num = 4;
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