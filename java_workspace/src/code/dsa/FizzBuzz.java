package code.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(getFizzBuzzPattern(n));
    }

    private static List<String> getFizzBuzzPattern(int n) {
        List<String> list = new ArrayList<String>();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>() {{
            put(3, "Fizz");
            put(5, "Buzz");
        }};
        for (int i = 1; i <= n; i++) {
            String s = "";

            for (Integer key : hashMap.keySet()) {
                if (i % key == 0) {
                    s += hashMap.get(key);
                }
            }
            if (s.equals("")) s += String.valueOf(i);
            list.add(s);

        }
        return list;
    }
}
