package code.leet_code;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(isDetectCapital("Jitendra"));
    }

    public static boolean isDetectCapital(String word) {
        if (word == null || word.isEmpty()) return true;

        int count = 0;
        for (char c : word.toCharArray()) if (Character.isUpperCase(c)) count++;
        if (count == 0 || count == word.length() || count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }
        return false;
    }
}

