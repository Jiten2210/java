package code.array;

public class Power {
    public static void main(String[] args) {
        String str = "jitu";
        powerSet(str, 0);
    }

    public static void powerSet(String list, int count) {
        System.out.println(list);
        for (int i = count; i < list.length(); i++) {
            String temp = list.substring(0, i);
            powerSet(temp, i);
        }
    }
}