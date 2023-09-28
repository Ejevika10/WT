package task2;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FigureCheckerTest {

    @Test
    public void isInFigure1() {
        FigureChecker fChecker = new FigureChecker(1,3);
        boolean actual = fChecker.isInFigure();
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isInFigure2() {
        FigureChecker fChecker = new FigureChecker(10,3);
        boolean actual = fChecker.isInFigure();
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isInFigure3() {
        FigureChecker fChecker = new FigureChecker(-4,-5);
        boolean actual = fChecker.isInFigure();
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}