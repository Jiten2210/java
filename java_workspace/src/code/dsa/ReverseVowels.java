package code.dsa;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Hello World";
        int begin = 0;
        int end = s.length() - 1;
        char ch[] = s.toCharArray();

        while (begin < end) {
            if (!isVowel(ch[begin])) {
                begin++;
                continue;
            }
            if (!isVowel(ch[end])) {
                end--;
                continue;
            }
            char t = ch[begin];
            ch[begin++] = ch[end];
            ch[end--] = t;
        }
        System.out.println(new String(ch));
    }

    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}

