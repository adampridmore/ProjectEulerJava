package projecteulerjava.problems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static projecteulerjava.problems.Problem1.solver;

public class Problem1Test {
    @Test
    public void solverTest() {
        assertThat(solver(), is(233168));
    }
}