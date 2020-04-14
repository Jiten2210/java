package code.leet_code.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDivide {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(getSelfDividingNumbers(left, right));

    }

    private static List getSelfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        while (left <= right) {
            if (selfDivideNumber(left)) {
                numbers.add(left);
            }
            left++;
        }
        return numbers;
    }

    private static boolean selfDivideNumber(int left) {
        int temp = left;
        while (left > 0) {
            int remainder = left % 10;
            if (remainder == 0) return false;
            if (temp % remainder != 0) {
                return false;
            }
            left /= 10;
        }
        return true;
    }
}
