package code.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abcgbdcbac", "cba"));
    }

    public static List<Integer> findAnagrams(String source, String pattern) {
        char[] target = new char[26];
        List<Integer> result = new ArrayList<>();
        if (source.length() == 0) return result;
        int n = pattern.length();
        if (n > source.length()) return result;

        for (char c : pattern.toCharArray()) target[c - 'a']++;

        char[] ch = source.toCharArray();
        char[] current = new char[26];
        for (int i = 0; i < n; i++) current[ch[i] - 'a']++;
        if (Arrays.equals(target, current)) result.add(0);


        for (int i = n; i < source.length(); i++) {
            int prev = i - n;
            current[source.charAt(prev) - 'a']--;
            current[source.charAt(i) - 'a']++;

            if (Arrays.equals(target, current)) result.add(prev + 1);
        }
        return result;
    }
}
