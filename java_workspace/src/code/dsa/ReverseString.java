package code.dsa;

public class ReverseString {
    public static void main(String[] args) {
        String input = "a,b$c";
        char[] temp_array = input.toCharArray();
        char ch[] = reverse(temp_array);
        for (char c : ch) {
            System.out.println(c);

        }
    }

    public static char[] reverse(char str[]) {
        int right = str.length - 1, left = 0;
        while (left < right) {
            if (!Character.isAlphabetic(str[left]))
                left++;
            else if (!Character.isAlphabetic(str[right]))
                right--;

            else {
                str[left] ^= str[right];
                str[right] ^= str[left];
                str[left] ^= str[right];

                ++left;
                --right;
            }
        }

        return str;
    }
}

