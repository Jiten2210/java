package code.dsa;

import java.util.HashSet;

class DisjointArray {

    public static boolean isDisjoint(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!hs.contains(arr1[i])) hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String args[]) {

        int[] arr1 = {9, 4, 3, 1, -2, 6, 5};
        int[] arr2 = {7, 10, 8};
        int[] arr3 = {1, 12};
        System.out.println(isDisjoint(arr1, arr2));
        System.out.println(isDisjoint(arr1, arr3));

    }
}