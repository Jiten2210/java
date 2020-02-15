package code;
public class GenerateCombinationsOfArray {

    public static void main(String[] args) {

        int rows = 8;
        for(int i =0;i<rows;i++) {
            int number = 1;
            for(int j=0;j<=i;j++) {
                 System.out.print(number+" ");
                 number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}