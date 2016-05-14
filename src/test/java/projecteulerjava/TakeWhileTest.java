package projecteulerjava;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static projecteulerjava.TakeWhile.takeWhile;

public class TakeWhileTest {
    @Test
    public void basicTakeWhile() throws Exception {
        List<Integer> filteredList = takeWhile(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream(), i -> i <= 5)
                .collect(Collectors.toList());

        assertThat(filteredList, is(asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void infinite_stream_takeWhile() {
        List<Integer> filteredList = takeWhile(IntStream.iterate(0, x -> x + 1).boxed(), x -> x < 10).collect(Collectors.toList());

        assertThat(filteredList, is(asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
}