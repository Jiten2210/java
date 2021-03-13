package code.array;

import java.util.Arrays;

class IsomorphicStrings {
    static int size = 128;

    static boolean areIsomorphic(String str1, String str2) {
        int a1[] = new int[size];
        int a2[] = new int[size];
        Arrays.fill(a1, -1);
        Arrays.fill(a2, -1);
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (a1[c1] != a2[c2])
                return false;
            a1[c1] = i;
            a2[c2] = i;
        }
        return true;
    }


    public static void main(String[] args) {
        boolean res = areIsomorphic("aab", "xxy");
        System.out.println(res);

        res = areIsomorphic("aab", "xyz");
        System.out.println(res);
    }
}