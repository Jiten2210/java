package code.practice;

import java.util.HashMap;
import java.util.Map;

public class SentenceSort {
    public static void main(String[] args) {
        String s = "jitu3 tanu4 vaidik5 mummy2 papa1";
        System.out.println(sortSentence(s));
    }

    private static String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        for (String str : s.split(" ")) {
            int priority = str.charAt(str.length() - 1) - '0';
            map.put(priority, str.substring(0, str.length() - 1));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= map.size(); i++) {
            sb.append(map.get(i) + " ");
        }
        return String.valueOf(sb).trim();
    }
}
