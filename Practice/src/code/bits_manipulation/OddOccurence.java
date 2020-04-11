package code.bits_manipulation;

class OddOccurence {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,2,3,1,4,1,4};
        int n = a.length;
        System.out.println(getOddOccurrence(a, n));
    }

    private static int getOddOccurrence(int a[], int n) {
        int i;
        int res = 0;
        for (i = 0; i < n; i++) {
            res = res ^ a[i];
        }
        return res;
    }

}
