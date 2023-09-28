package task5;

import org.junit.Test;

import static org.junit.Assert.*;
import static task5.Main.res;

public class MainTest {

    @Test
    public void resCheck() {
        int[] arr = new int[]{13, 51, 93, 91, 42, 36, 96, 37, 27, 18};
        int result = res(arr.length,arr);
        int expected = 6;
        assertEquals(expected, result);
    }
    @Test
    public void resCheck1() {
        int[] arr = new int[]{13, 14, 15, 18};
        int result = res(arr.length,arr);
        int expected = 0;
        assertEquals(expected, result);
    }
    @Test
    public void resCheck2() {
        int[] arr = new int[]{};
        int result = res(arr.length,arr);
        int expected = 0;
        assertEquals(expected, result);
    }
    @Test
    public void resCheck3() {
        int[] arr = new int[]{13};
        int result = res(arr.length,arr);
        int expected = 0;
        assertEquals(expected, result);
    }
}