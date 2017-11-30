package Programming;

public class DivideString {
	static void divideString(String str, int n) {
		int str_size = str.length();

		if (str_size % n != 0) {
			System.out.println("Invalid Input: String size is not divisible by n");
			return;
		}

		int part_size = str_size / n;
		for (int i = 0; i < str_size; i++) {
			if (i % part_size == 0)
				System.out.println();
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		String str = "jitu_tanu_alok_omji_anuj_";
		divideString(str, 5);
	}
}
