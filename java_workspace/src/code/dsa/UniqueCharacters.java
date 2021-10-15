package code.dsa;

import java.util.HashSet;

public class UniqueCharacters {
    private static final int ASCII_CHARS = 256; // number of ASCII characters

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("Mahendra"));
    }

    public static boolean uniqueCharacters(String str) {
        if (str.length() > ASCII_CHARS) {
            return false;
        }
        HashSet<Character> mySet = new HashSet(ASCII_CHARS);
        for (int i = 0; i < str.length(); i++) {
            if (mySet.contains(str.charAt(i))) {
                return false;
            } else {
                mySet.add(str.charAt(i));
            }
        }
        return true;
    }
}