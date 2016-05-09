package ProjectEulerJava;

import org.junit.Test;

import static ProjectEulerJava.Problem2.solver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Problem2Test {
    @Test
    public void test() {
        assertThat(solver(), is(4613732L));
    }
}