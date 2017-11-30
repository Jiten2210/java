package Programming;

public class PrintDuplicates {
	static final int NO_OF_CHARS = 256;

	static void getCharacterCount(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	static void printDups(String str) {
		int count[] = new int[NO_OF_CHARS];
		getCharacterCount(str, count);

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.printf("%c,  count = %d \n", i, count[i]);

	}

	public static void main(String[] args) {
		String str = "code testing in progress mode";
		printDups(str);
	}
}
