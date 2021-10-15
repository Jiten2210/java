package code.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class StringAlikeHalves {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int firstHalfVowelsCount = (int) IntStream.range(0, s.length() / 2).filter(i -> vowels.contains(s.charAt(i))).count();
        int secondHalfVowelsCount = (int) IntStream.range(s.length() / 2, s.length()).filter(i -> vowels.contains(s.charAt(i))).count();
        return firstHalfVowelsCount == secondHalfVowelsCount;
    }
}
