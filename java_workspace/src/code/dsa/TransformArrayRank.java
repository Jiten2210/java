package code.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TransformArrayRank {
    public static void main(String[] args) {
        int[] a = {40, 20, 30, 10};
        int[] temp = a.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int i = 0; i < temp.length; i++) {
            if (map.get(temp[i]) == null)
                map.put(temp[i], ++rank);
        }

        for (int i = 0; i < a.length; ++i) {
            temp[i] = map.get(a[i]);
        }
        for (int i : temp) {
            System.out.println(i);
        }
    }
}
