package task1;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void count() {
        Counter counter = new Counter(0,0);
        double actual = counter.count();
        double expected = 0.5;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void count1() {
        Counter counter = new Counter(-1,1);
        double actual = counter.count();
        double expected = -0.5;
        Assert.assertEquals(expected,actual);
    }
}