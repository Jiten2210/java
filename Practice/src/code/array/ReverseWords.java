package code.array;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "You are beautiful";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        if (s.isEmpty())
            return " ";
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            if (!a[i].equals("")) {
                sb.append(a[i]).append(" ");
            }

        }
        return sb.length() == 0 ? " " : sb.substring(0, sb.length() - 1);
    }
}
