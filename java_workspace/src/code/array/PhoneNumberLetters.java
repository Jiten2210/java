package code.array;

import java.util.ArrayList;
import java.util.List;

class PhoneNumberLetters {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> out = new ArrayList<>();

        if (digits.isEmpty())
            return out;

        String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        out.add("");

        for (char ch : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (String str : out) {
                String letters = strings[Integer.parseInt(String.valueOf(ch))];
                for (char letter : letters.toCharArray()) {
                    temp.add(str + letter);
                }
            }
            out = temp;
        }
        return out;
    }
}