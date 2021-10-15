package code.dsa;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(a) + " ====== " + findLucky1(a));

    }

    public static int findLucky(int[] arr) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (map.get(i) == i) {
                max = Math.max(max, i);
            }
        }
        return max;
    }

    // given constraint 1 <= arr.length <= 500
    public static int findLucky1(int[] arr) {
        int[] count = new int[501];
        for (int x : arr) {
            count[x]++;
        }
        for (int i = 500; i >= 1; i--) {
            if (count[i] == i) return i;
        }
        return -1;
    }
}
