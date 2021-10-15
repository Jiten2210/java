package code.dsa;

public class RansomeNotes {
    public static void main(String[] args) {
        System.out.println(canConstruct("ab", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] character = new int[26];
        for (char c : magazine.toCharArray()) {
            character[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (character[c - 'a'] == 0) {
                return false;
            }
            character[c - 'a']--;
        }
        return true;
    }
}
