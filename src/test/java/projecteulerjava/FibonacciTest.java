package projecteulerjava;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static projecteulerjava.Fibonacci.fibonacciLongStream;

public class FibonacciTest {

    @Test
    public void basic_fibonacci_list() {
        List<Long> fibonacciLongStream = fibonacciLongStream(0, 1)
                .boxed()
                .limit(5)
                .collect(Collectors.toList());

        assertThat(fibonacciLongStream, is(asList(0L, 1L, 1L, 2L, 3L)));
    }

    @Test
    public void different_initial_values() {
        List<Long> fibonacciLongStream = fibonacciLongStream(10, 20)
                .boxed()
                .limit(3)
                .collect(Collectors.toList());

        assertThat(fibonacciLongStream, is(asList(10L, 20L, 30L)));
    }
}