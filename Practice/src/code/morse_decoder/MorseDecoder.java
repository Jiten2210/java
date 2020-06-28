package code.morse_decoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MorseDecoder {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", ".-");
        map.put("D", "-..");
        map.put("E", ".");
        map.put("G", "--.");
        map.put("I", "..");

        map.put("K", "-.-");
        map.put("M", "--");
        map.put("N", "-.");
        map.put("O", "---");
        map.put("R", ".-.");
        map.put("S", "...");
        map.put("T", "-");
        map.put("U", "..-");
        String w = map.put("W", ".--");
        MorseTree<String> morseTree = loadMap(map);
        StringBuilder input = new StringBuilder("?-?");
        int n = input.length();
        if (input.toString().contains("?")) {
            for (int i = 0; i < n; i++) {
                if (input.charAt(i) == '?') {
                    StringBuilder s = new StringBuilder(input);
                     s.setCharAt(i,'.');
                    decode(morseTree, s.toString());
                }
                if (input.charAt(i) == '?') {
                    StringBuilder s = new StringBuilder(input);
                    s.setCharAt(i,'-');
                    decode(morseTree, s.toString());
                }
            }
        } else
            decode(morseTree, input.toString());
    }


    private static MorseTree<String> loadMap(Map<String, String> map) {
        MorseTree<String> morseTree = new MorseTree<String>();
        map.forEach((symbol, code) -> {
            morseTree.add(symbol, code);
        });
        return morseTree;
    }

    private static void decode(MorseTree<String> morseTree, String input) {
        System.out.println("+++ " + input);
        ArrayList<String> decodedLine = new ArrayList<String>();
        String decodedCharacter = morseTree.decode(input);
        decodedLine.add(decodedCharacter);
        decodedLine.forEach(System.out::println);
    }
}


