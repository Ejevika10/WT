package task4;

import org.junit.Test;

import static org.junit.Assert.*;
import static task4.PrimeArr.isPrime;

public class PrimeArrTest {

    @Test
    public void printPrimeIndex() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PrimeArr primeArr = new PrimeArr(10,arr);

        String actualOutput = primeArr.printPrimeIndex();

        String expectedOutput = "1 2 4 6 ";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printNoPrimeIndex() {
        int[] arr = new int[]{-3,0,1,4,6,10};
        PrimeArr primeArr = new PrimeArr(6,arr);

        String actualOutput = primeArr.printPrimeIndex();

        String expectedOutput = "There are no prime numbers here(";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isPrimeCheck() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(5));
        assertTrue(isPrime(7));
        assertTrue(isPrime(11));
        assertFalse(isPrime(0));
        assertFalse(isPrime(1));
        assertFalse(isPrime(4));
        assertFalse(isPrime(6));
        assertFalse(isPrime(8));
    }
}