package projecteulerjava;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static projecteulerjava.Problem2.solver;

public class Problem2Test {
    @Test
    public void test() {
        assertThat(solver(), is(4613732L));
    }
}