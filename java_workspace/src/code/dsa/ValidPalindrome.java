package code.dsa;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}
