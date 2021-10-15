package code.dsa;

public class Leaders {
    public static void main(String[] args) {
        int[] a = new int[]{16, 17, 4, 3, 5, 2};
        int n = a.length;
        Leaders l = new Leaders();
        l.findLeaders(a, n);
    }

    void findLeaders(int[] b, int size) {
        int max = b[size - 1];
        System.err.print(max + " ");
        for (int i = size - 2; i >= 0; i--) {
            if (max < b[i]) {
                max = b[i];
                System.err.print(max + " ");
            }
        }
    }

}
