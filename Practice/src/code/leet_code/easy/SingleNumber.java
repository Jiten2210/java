package code.leet_code.easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 2};
        int num = 0;
        for (int i = 0; i < a.length; i++)
            num = num ^ a[i];

        System.out.println(num);
    }
}
