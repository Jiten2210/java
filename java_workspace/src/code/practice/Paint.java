package code.practice;

public class Paint {

    public static void main(String[] args) {
        int[][] image = {{0, 0, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {1, 0, 0, 1}};
        int x = 1;
        int y = 2;
        paintAll(image, x, y);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++)
                System.out.print(image[i][j] + " ");
            System.out.println();
        }
    }

    static void paintAll(int[][] image, int x, int y)    //co ordinates
    {
        int row = image.length;
        int col = image[0].length;
        //checks
        if (x < 0 || y < 0 || x >= row || y >= col || isFilled(image, x, y)) return;
        fill(image, x, y);
        paintAll(image, x + 1, y);
        paintAll(image, x - 1, y);
        paintAll(image, x, y + 1);
        paintAll(image, x, y - 1);
    }


    static boolean isFilled(int[][] image, int x, int y)   //check black color -> 1  white color -> 0 assumption
    {
        if (image[x][y] == 1) return true;

        return false;
    }

    static void fill(int[][] image, int x, int y)        // if white paint with black
    {
        image[x][y] = 1;    //black
    }

}
