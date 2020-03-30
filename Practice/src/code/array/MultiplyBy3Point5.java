package code.array;

public class MultiplyBy3Point5 {
    public static void main(String[] args) {
        int num = 5;
        float newNum = (num << 2) - (num >> 1);
        System.out.println("After multiplication by 3 number is : " + newNum);
    }

}