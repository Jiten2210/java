package code.array;

import java.util.HashSet;

class GetPairs {

    public static void main(String args[]) {
        int[] arr = {10, 4, 8, 13, 5};
        int n = arr.length;
        findPair(arr, n);
    }

    public static void findPair(int[] arr, int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (Integer i : arr) {
            s.add(i);
        }

        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (s.contains(sum)) {
                    found = true;

                    System.out.println(arr[i] + " "
                            + arr[j]);
                }
            }
        }

        if (found == false)
            System.out.println("Not Exist ");
    }
}