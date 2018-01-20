package JUnit_Test;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Administrator on 2018/1/20.
 */
public class CalculatorTest {
    public static  Calculator c=new Calculator();
    @Test
    public void add() throws Exception {

        c.add(2);
        c.add(2);

        assertEquals(4,c.getResult());
    }

    @Test
    public void substract() throws Exception {

        c.substract(2);
        assertEquals(2,c.getResult());
    }

    @Ignore
    public void multiply() throws Exception {

        c.multiply(10);
    }

    @Test(expected = Exception.class)
    public void divide() throws Exception {

        c.divide(0);
    }

    @Test
    public void square() throws Exception {

    }

    @Test(timeout = 1000)
    public void squareRoot() throws Exception {
        c.squareRoot(9);
    }

    @Test
    public void clear() throws Exception {
    }

}