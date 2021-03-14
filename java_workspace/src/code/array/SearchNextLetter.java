package code.array;

public class SearchNextLetter {
    public static void main(String[] args) {
        System.out.println(searchNextLetter(new char[]{'a', 'b', 'c', 'f', 'i'}, 'd'));
        System.out.println(searchNextLetter(new char[]{'a', 'b', 'd', 'f', 'i'}, 'b'));

    }

    private static char searchNextLetter(char[] letters, char key) {
        int n = letters.length;
        if (key < letters[0] || key > letters[n - 1]) return letters[0];
        int begin = 0, end = n - 1;

        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (key < letters[mid]) end = mid - 1;
            else
                begin = mid + 1;
        }
        return letters[begin % n];
    }
}
