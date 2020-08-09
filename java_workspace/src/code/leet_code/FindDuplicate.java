package code.leet_code;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 3};
        System.out.println(findDuplicate(a));
    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0], fast = arr[arr[0]];
        while (fast != slow) {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }

        fast = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;

    }
}