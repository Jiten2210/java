package code.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAverageScore {
    static String[][] scores = new String[][]{{"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}};

    public static void main(String[] args) {
        Map mapGroup = Arrays.stream(scores).collect(Collectors.groupingBy(a -> a[0], Collectors.averagingInt(a -> Integer.parseInt(a[1]))));
        Double max = (Double) mapGroup.values().stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}



