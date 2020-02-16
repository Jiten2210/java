package code.array;

public class CountWords {

    public static void main(String[] args) {
        CountWords.countWords("India is\t a great\n nation");
    }

    public static void countWords(String s1) {
        s1 = s1.replaceAll("\n", " ").replaceAll("\t", "").trim().replaceAll(" +", " ");
        char array1[] = s1.toCharArray();
        int i = 0, countWords = 0;

        while (i < s1.length()) {

            if (array1[i] == ' ') {

                countWords++;
            }
            i++;
        }

        System.out.println("Total number of words are :- " + (countWords + 1));
    }

}