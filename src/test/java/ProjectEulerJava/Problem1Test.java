package ProjectEulerJava;

import org.junit.Test;

import static ProjectEulerJava.Problem1.solver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Problem1Test {
    @Test
    public void solverTest() {
        assertThat(solver(), is(233168));
    }
}