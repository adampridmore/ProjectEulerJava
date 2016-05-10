package projecteulerjava;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static projecteulerjava.TakeWhile.takeWhile;

public class TakeWhileTest {
    @Test
    public void basicTakeWhile() throws Exception {
        List<Integer> filteredList = takeWhile(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream(), i -> i <= 5)
                .collect(Collectors.toList());

        assertThat(filteredList, is(Arrays.asList(1,2,3,4,5)));
    }
}