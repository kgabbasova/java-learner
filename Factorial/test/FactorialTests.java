import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FactorialTests {
    @Test
    public void testCalculate5() {
        int n = 5;
        BigInteger factorial = Factorial.calculate(n);
        assertEquals("5! should be 120",BigInteger.valueOf(120), factorial);
    }

    @Test
    public void testCalculate0() {
        int n = 0;
        BigInteger factorial = Factorial.calculate(n);
        assertEquals("0! should be 1",BigInteger.valueOf(1), factorial);
    }
}