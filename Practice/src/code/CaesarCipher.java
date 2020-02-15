package code;

public class CaesarCipher {
	public static void main(String[] args) {
		String input = "JituTanu";
		System.out.println(encrypt(input, 4));
	}

	private static String encrypt(String input, int s) {
		StringBuffer result = new StringBuffer();
		char ch;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i)))
				ch = (char) (((int) input.charAt(i) + s - 65) % 26 + 65);

			else
				ch = (char) (((int) input.charAt(i) + s - 97) % 26 + 97);

			result.append(ch);

		}
		return result.toString();
	}
}
