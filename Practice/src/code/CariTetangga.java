package code;


import java.util.ArrayList;
import java.util.Random;

public class CariTetangga {

    Random r = new Random();
    int[][] position;
    int width = 8, height = 8;

    public CariTetangga() {
        position = new int[width][height];
        for (int i = 0; i < position.length; i++) 
            for (int j = 0; j < position[0].length; j++) 
                position[i][j] = r.nextInt(2);
    }
    
    public int[][] getMatrix(){return position; }

    public static void main(String[] args) {
        CariTetangga cariTetangga = new CariTetangga(); 
        cariTetangga.searchNeighbor(2,3);
    }
    static int total = 0;
    ArrayList<Integer[]> list = new ArrayList<>();
    
    
    public int getTotal(){return total; }

    public void searchNeighbor(int x, int y) {
        if(position[x][y] == 0)
            return;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int nx = x + i;
                int ny = y + j;
                if (nx < width && nx > -1 && ny < height && ny > -1) {
                    if (position[nx][ny] != 0) {
                        Integer aa[] = {nx, ny};
                        if (!list.contains(aa)) {
                            list.add(aa);
                            total++;
                            searchNeighbor(nx, ny);
                        }
                    }
                }
            }
        }
    }
}