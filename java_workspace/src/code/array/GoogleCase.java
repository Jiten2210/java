package code.array;

public class GoogleCase {

    public static void main(String[] args) {
        String str = "Incredible nation india";
        System.out.println(convert(str));
    }

    static String convert(String s) {
        int n = s.length();
        String out = "";
        out = out + Character.toLowerCase(s.charAt(0));

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ' ' && i < n) {
                out += " " + Character.toLowerCase
                        (s.charAt(i + 1));
                i++;

            } else
                out = out + Character.toUpperCase(s.charAt(i));

        }
        return out;

    }


}
