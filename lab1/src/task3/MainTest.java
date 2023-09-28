package task3;

import org.junit.Test;

import static org.junit.Assert.*;
import static task3.Main.func;

public class MainTest {
    double epsilon = 1e-6;
    @Test
    public void testFunc1() {
        double result = func(0);
        double expected = 0;
        assertEquals(expected, result, epsilon);
    }

    @Test
    public void testFunc2() {
        double result = func(1);
        double expected = Math.tan(1);
        assertEquals(expected, result, epsilon);
    }

    @Test
    public void testFunc3() {
        double result = func(-1);
        double expected = Math.tan(-1);
        assertEquals(expected, result, epsilon);
    }
}