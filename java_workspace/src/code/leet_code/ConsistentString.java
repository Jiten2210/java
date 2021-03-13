package code.leet_code;

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"a", "abb", "aaab","cd","ba"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isConsistent = false;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }
}
