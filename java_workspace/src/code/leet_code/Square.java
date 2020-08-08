package code.leet_code;

public class Square {
    public static void main(String[] args) {
        System.out.println(getSquare(146));
    }

    private static int getSquare(int num) {
        if (num < 2) {
            return num;
        }
        int low = 0, mid = 0, high = num;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (mid > num / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
                if (low > num / low) {
                    return mid;
                }
            }
        }
        return low;
    }
}

