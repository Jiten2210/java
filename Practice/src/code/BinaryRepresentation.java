package code;

public class BinaryRepresentation {
	public static void main(String[] args) {
		int a = 33;
		BinaryRepresentation b = new BinaryRepresentation();
		System.out.println("Number in binary is : " + b.getBinary(a));
	}

	String s = "";

	private String getBinary(int num) {
		if (num == 0)
			return s;

		getBinary(num / 2);
		if (num % 2 == 1)
			s = s + "1";
		else
			s = s + "0";

		return s;
	}

}