package code.leet_code;

public class CountVowels {

    public static void main(String[] args) {
        String text = "India";
        System.out.println(totalVowels(text, text.length(), 0));
    }

    private static int totalVowels(String text, int length, int index) {
        int count = 0;
        if (length == 0) return 0;
        char character = Character.toUpperCase(text.charAt(index));
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            count++;
        }
        return count + totalVowels(text, length - 1, index + 1);
    }
}
