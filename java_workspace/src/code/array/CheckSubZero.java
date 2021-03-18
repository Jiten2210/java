package code.array;

import java.util.HashMap;

class CheckSubZero {

    public static boolean findSubZero(int[] arr) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hMap.get(sum) != null) return true;
            hMap.put(sum, i);
        }
        return false;
    }

    public static void main(String args[]) {

        int[] arr = {6, 4, -7, 3, 12, 9};
        System.out.println(findSubZero(arr));

    }
}