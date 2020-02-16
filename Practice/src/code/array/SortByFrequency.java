package code.array;

import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 5, 3, 4, 4, 5, 5, 0, 0, 0};

        int count = 1;

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (ht.containsKey(arr[i]))
                ht.put(arr[i], ht.get(arr[i]) + 1);
            else
                ht.put(arr[i], count);
        }

        ArrayList<Map.Entry<Integer, Integer>> l = new ArrayList(ht.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {

            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println(l);
    }
}