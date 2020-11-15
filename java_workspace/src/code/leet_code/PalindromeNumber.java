package code.leet_code;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 12121;
        int[] a = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(palindrome(a, 0) ? "Palindrome Array" : "Not a Palindrome Array");
        System.out.println(checkPalindrome(x) ? "Palindrome Number" : "Not a Palindrome");
        System.out.println(checkPalindrome1(x) ? "Palindrome Number" : "Not a Palindrome");
    }

    private static boolean palindrome(int[] array, int idx) {
        if (idx == array.length / 2)
            return true;
        else if (array[idx] != array[array.length - 1 - idx])
            return false;
        else
            return palindrome(array, idx + 1);
    }

    private static boolean checkPalindrome1(int x) {
        int reverse = 0, number = x;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
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
