package code.practice;

class FloodFill {

    static int M = 8;
    static int N = 8;

    public static int[][] dfs(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }

    public static void dfs(int[][] image, int x, int y, int color, int newColor) {
        if (x < 0 || x >= M || y < 0 || y >= N || image[x][y] != color)
            return;

        image[x][y] = newColor;

        dfs(image, x + 1, y, color, newColor);
        dfs(image, x - 1, y, color, newColor);
        dfs(image, x, y + 1, color, newColor);
        dfs(image, x, y - 1, color, newColor);
    }

    public static void main(String[] args) {
        int screen[][] =
                {{1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 0, 0, 1, 1, 0, 1, 1},
                        {1, 2, 2, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 2, 2, 0},
                        {1, 1, 1, 1, 1, 2, 1, 1},
                        {1, 1, 1, 1, 1, 2, 2, 1},
                };
        int x = 4, y = 4, newC = 3;
        dfs(screen, x, y, newC);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
    }
}
