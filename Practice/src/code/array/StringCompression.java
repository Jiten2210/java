package code.array;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbbcc";
        int count = 1;
        String output = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ++count;
            } else {
                output = output + s.charAt(i) + count;
                count = 1;
            }
        }
        output = output + s.charAt(s.length() - 1) + count;
        System.out.println(output.length() < s.length() ? output : s);
    }
}
