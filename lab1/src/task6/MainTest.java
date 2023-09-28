package task6;

import org.junit.Test;

import static org.junit.Assert.*;
import static task6.Main.res;

public class MainTest {

    @Test
    public void resCheck() {
        double[] arr = new double[]{1, 2, 3, 4};
        double[][] expectedArr = new double[][]{{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
        double[][] result = res(arr,4);
        assertArrayEquals(expectedArr,result);
    }
    @Test
    public void resCheck1() {
        double[] arr = new double[]{};
        double[][] expectedArr = new double[0][];
        double[][] result = res(arr,0);
        assertArrayEquals(expectedArr,result);
    }
    @Test
    public void resCheck2() {
        double[] arr = new double[]{1};
        double[][] expectedArr = new double[][]{{1}};
        double[][] result = res(arr,1);
        assertArrayEquals(expectedArr,result);
    }
}