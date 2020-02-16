package code.array;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        int check = num & (num - 1);

        if (check == 0 && num > 0) {
            System.out.println("Number " + num + " is power of 2");
        } else {
            System.out.println("Number " + num + " is not power of 2");
        }
    }

}