package code.leet_code;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(isPalindrome(s) + " ===== " + isPalindrome1(s));
    }

    private static boolean isPalindrome1(String s) {
        StringBuilder s1 = new StringBuilder(s);
        return s1.reverse().toString().equalsIgnoreCase(s);
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
