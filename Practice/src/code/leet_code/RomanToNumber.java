package code.leet_code;

import java.util.HashMap;

class RomanToNumber {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        String roman = "CLIV";

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int number = 0;

        for (int i = 0; i < roman.length() - 1; i++) {
            if (romanMap.get(roman.charAt(i)) < romanMap.get(roman.charAt(i + 1))) {
                number -= romanMap.get(roman.charAt(i));
            } else {
                number += romanMap.get(roman.charAt(i));
            }
        }
        number += romanMap.get(roman.charAt(roman.length() - 1));
        System.out.println(number);
    }
}