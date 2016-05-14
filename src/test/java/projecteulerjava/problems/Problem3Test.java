package projecteulerjava.problems;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem3Test {
    @Test
    public void solver() {
        assertThat(Problem3.solver(600851475143L), is(6857L));
    }
}