package code.practice;

import java.util.HashMap;
import java.util.Map;

public class SentenceSorting {
    public static void main(String[] args) {
        String s = "jitu1 tanu3 vaidik4 mummy5 papa2";
        System.out.println(sortSentence(s));
    }

    private static String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        for (String str : s.split(" ")) {
            int rank = str.charAt(str.length() - 1) - '0';
            map.put(rank, str.substring(0, str.length() - 1));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= map.size(); i++) {
            sb.append(map.get(i) + " ");
        }
        return String.valueOf(sb).trim();
    }
}
