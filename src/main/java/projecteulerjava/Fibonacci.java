package projecteulerjava;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Fibonacci {
    private Fibonacci() {
    }

    public static LongStream fibonacciLongStream(final long first, final long second) {
        return Stream
                .iterate(new long[]{first, second}, f -> new long[]{f[1], f[0] + f[1]})
                .mapToLong(x -> x[0])
                ;
    }
}
