package code.array;

public class SegregateArray {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 2, 1, 0, 1, 0, 1, 0, 2, 1};
        segregateArray(a);
    }

    private static void segregateArray(int[] a) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }

        }
        i = 0;
        while (cnt0 > 0) {
            a[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            a[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            a[i++] = 2;
            cnt2--;
        }
        for (int k : a) {
            System.out.println(k);
        }
    }
}
