package code.array;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramSort implements Comparator<String> {
    public String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    @Override
    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }


    public static void main(String[] args) {
        String[] strArray = {"abcd", "abc", "abce", "acd", "abdc"};
        Arrays.sort(strArray, new AnagramSort());

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}