package code.leet_code.easy;

public class HammingDistance {
    public static void main(String[] args) {
        int a = 1, b = 4;
        int temp = a ^ b;
        int noOfOnes = 0;

        while (temp > 0) {
            noOfOnes += temp & 1;
            temp >>= 1;
        }
        System.out.println(noOfOnes);
        System.out.println((int) Integer.toBinaryString(a ^ b).chars()
                .boxed()
                .map(Character::getNumericValue)
                .filter(number -> number == 1)
                .count());
    }
}
