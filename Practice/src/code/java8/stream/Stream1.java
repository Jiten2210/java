package code.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jitu", "Tanu", "Mummy", "Papa", "Puja");

        //filter
        List<String> result = names.stream().filter(name -> !"jitu".equalsIgnoreCase(name)).collect(Collectors.toList());
        result.forEach(System.out::println);

        List<String> result1 = Collections.singletonList(names.stream()
                .filter(x -> "jack".equals(x))
                .findAny()
                .orElse(null));

        System.out.println(result1);

        Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }
}
