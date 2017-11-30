package Programming;

public class CountWords {

	public static void main(String[] args) {
		CountWords.countWords("Omji alok jitu yayyy lol       three\n  four\nfive  ");
	}

	public static void countWords(String s1) {
		s1 = s1.replaceAll("\n", " ");
		s1 = s1.replaceAll("\t", " ");
		s1 = s1.trim().replaceAll(" +", " ");

		char array1[] = s1.toCharArray();

		int i = 0, countWords = 0;

		while (i < s1.length()) {

			if (array1[i] == ' ') {

				countWords++;
			}
			i++;
		}

		System.out.println("Number Of Words are :- " + (countWords + 1));
	}

}