package code.dsa;

public class EqualSum {
    public static void main(String[] args) {
        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
        System.out.println(valueOfWord(firstWord) + valueOfWord(secondWord) == valueOfWord(targetWord));

    }

    public static int valueOfWord(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            sb.append(c - 'a');

        return Integer.parseInt(sb.toString());
    }
}

