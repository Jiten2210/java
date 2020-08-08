package code.array;

import java.util.HashSet;

public class ProductPair {
    public static void main(String[] args) {
        int a[] = {40, 20, 30, 13, 21, 10};
        int x = 400;
        if (findPair(a, a.length, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean findPair(int[] a, int length, int x) {
        HashSet<Integer> hs = new HashSet<>();

        if (length < 2)
            return false;

        for (int i = 0; i < length; i++) {
            if (a[i] == 0) {
                if (x == 0)
                    return true;
                else
                    continue;
            }

            if (x % a[i] == 0) {
                if (hs.contains(x / a[i]))
                    return true;
                hs.add(a[i]);
            }
        }
        return false;

    }

}
