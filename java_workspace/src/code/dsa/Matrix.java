package code.dsa;

public class Matrix {
    public static void main(String[] args) {
        String s = "hello how are you  hi hello how are you";

        /*int mat[][] = new int[][]{{1, 1, 0}, {0, 1, 1}, {1, 0, 1}};
        int rows = mat.length;
        int cols = mat[0].length;
        System.out.println(getPathCount(rows, cols));*/


    }

    /* 0  0 0
     0  0 0
     0  0 0             rows = 3 , cols = 3*/

    /*private static int getPathCount(int rows, int cols) {
        int temp[][] = new int[rows][cols];
// tc ,sc -> O(m*n)
        for (int i = 0, j =0; i <rows; i++,j++) {      // O(m)
            temp[i][0] = temp[0][j] =1;
        }
        for (int i = 1; i < rows ; i++) { //O(m)
            for (int j = 1; j < cols; j++) { //O(n)
                temp[i][j]= temp[i-1][j] + temp[i][j-1];
            }

        }

        return temp[rows-1][cols-1];

       *//* if( rows == 0 ||  cols == 0 ) return 1;
        return getPathCount(rows +1, cols) + getPathCount(rows, cols +1);*//*
    }*/
}
