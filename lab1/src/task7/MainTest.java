package task7;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;
import static task5.Main.res;

public class MainTest {

    @Test
    public void sortCheckUnsortedArr() {
        double[] arr = new double[]{0,7,2,10,56,3,1,-10};
        double[] expected = arr.clone();
        Arrays.sort(expected);
        sort(arr);
        for (int i = 0; i < arr.length; i++){
            assertEquals(arr[i], expected[i], 0.0);
        }
    }
    @Test
    public void sortCheckSortedArr() {
        double[] arr = new double[]{-10,0,1,2,3,7,10,56,};
        double[] expected = arr.clone();
        Arrays.sort(expected);
        sort(arr);
        for (int i = 0; i < arr.length; i++){
            assertEquals(arr[i], expected[i], 0.0);
        }
    }
    @Test
    public void sortCheckEmptyArr() {
        double[] arr = new double[]{};
        double[] expected = arr.clone();
        Arrays.sort(expected);
        sort(arr);
        for (int i = 0; i < arr.length; i++){
            assertEquals(arr[i], expected[i], 0.0);
        }
    }
}