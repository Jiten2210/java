package code.leet_code;

import java.math.BigInteger;

public class ReverseInteger {

    public static void main(String[] args) {
        int n = 324569273;
        BigInteger x = BigInteger.valueOf(n);
        String input = String.valueOf(x);
        StringBuilder s = new StringBuilder(input);
        System.out.println(getReverse(s));

    }

    private static int getReverse(StringBuilder s) {
        if (Character.isDigit(s.charAt(0))) return Integer.valueOf(s.reverse().toString());
        return Integer.valueOf(s.charAt(0) + new StringBuilder(s.substring(1, s.length())).reverse().toString());

    }
}

/*    public int getReverse(int x) {
        boolean flag = false;
        if (x < 0) {
            x = 0 - x;
            flag = true;
        }

        int res = 0;
        int p = x;

        while (p > 0) {
            int mod = p % 10;
            p = p / 10;
            res = res * 10 + mod;
        }

        if (flag) {
            res = 0 - res;
        }

        return res;
    }*/
