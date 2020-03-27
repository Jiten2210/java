package code.array.leet_code.easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 12121;
        System.out.println(checkPalindrome(x) ? "Palindrome Number" : "Not a Palindrome");
        System.out.println(checkPalindrome1(x) ? "Palindrome Number" : "Not a Palindrome");
    }

    private static boolean checkPalindrome1(int x) {
        int reverse = 0, remainder, number = x;
        while (x != 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return reverse == number;
    }

    private static boolean checkPalindrome(int x) {
        String s = String.valueOf(x);
        int begin = 0, end = s.length() - 1;
        while (begin < end) {
            if (s.charAt(begin++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
