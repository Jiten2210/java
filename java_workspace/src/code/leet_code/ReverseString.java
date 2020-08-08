package code.leet_code;

public class ReverseString {
    public static void main(String[] args) {
        String s = "india";
        int begin = 0;
        int end = s.length() - 1;
        char ch[] = s.toCharArray();

        while (begin < end) {
            char temp = ch[begin];
            ch[begin++] = ch[end];
            ch[end--] = temp;
        }
        System.out.println(new String(ch));
    }
}
