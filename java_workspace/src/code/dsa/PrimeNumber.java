package code.dsa;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 100);
        List<Integer> primeList = stream.filter(PrimeNumber::isPrime)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(primeList);
    }

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}