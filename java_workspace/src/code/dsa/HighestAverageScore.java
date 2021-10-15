package code.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAverageScore {
    static String[][] scores = new String[][]{{"Bob", "87"}, {"Mike", "35"}, {"Bob", "52"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}};

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>() {{
            put("Bob", 87);
            put("Mike", 35);
            put("Bob", 52);
            put("Mike", 55);
            put("Jason", 35);
            put("Jessica", 99);

        }};

        Map mapGroup = Arrays.stream(scores).collect(Collectors.groupingBy(a -> a[0], Collectors.averagingInt(a -> Integer.parseInt(a[1]))));
        Double max = (Double) mapGroup.values().stream().max(Comparator.naturalOrder()).get();


        Map map = data.entrySet().stream().collect(Collectors.groupingBy(m -> m.getKey(),Collectors.averagingInt(m -> m.getValue())));
        Double maximum = (Double) map.values().stream().max(Comparator.naturalOrder()).get();
                 }
}



