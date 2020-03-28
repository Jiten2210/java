package code.easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }

    public static boolean isValid(String str) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> s = new Stack<>();
        char[] charArray = str.toCharArray();
        for (Character c : charArray) {
            if (map.keySet().contains(c)) s.push(c);
            else if (map.values().contains(c)) {
                if (!s.isEmpty() && map.get(s.peek()) == c) {
                    s.pop();
                } else
                    return false;

            }
        }
        return s.isEmpty();

    }
}
