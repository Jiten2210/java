package code.dsa;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }


    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int letters[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            letters[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            letters[t.charAt(i) - 'a']--;

        for (int i : letters) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

