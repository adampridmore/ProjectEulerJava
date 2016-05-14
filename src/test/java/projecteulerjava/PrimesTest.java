package projecteulerjava;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

public class PrimesTest {
    @Test
    public void list_of_primes() {
        List<Long> primes = Primes.stream()
                .limit(10)
                .collect(Collectors.toList());

        assertThat(primes, contains(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L));
    }
}