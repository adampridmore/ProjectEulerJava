package ProjectEulerJava;

import java.text.MessageFormat;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

//If we list all the natural numbers below 10 that are
//multiples of 3 or 5, we get 3, 5, 6 and 9. The sum
//of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.
public class Problem1 {
    public static void main(String[] args) {
        MessageFormat.format("Sum: {0}", solver());
    }

    public static int solver() {
        return IntStream
                .rangeClosed(1, 999)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum()
                ;
    }
}
