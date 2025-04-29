package integertests;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompareTo {

    @Test
    public void testEqualNo() {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("100");
        assertEquals(0, a.compareTo(b)); // 100 = 100 
    }

    @Test
    public void testSmallPositiveVsLargePositive() {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("200");
        assertTrue(a.compareTo(b) < 0); // 100 < 200
    }

    @Test
    public void testLargePositiveVsSmallPositive() {
        BigInteger a = new BigInteger("200");
        BigInteger b = new BigInteger("100");
        assertTrue(a.compareTo(b) > 0); // 200 > 100
    }

    @Test
    public void testNegativeVsPositive() {
        BigInteger a = new BigInteger("-100");
        BigInteger b = new BigInteger("100");
        assertTrue(a.compareTo(b) < 0); // -100 < 100
    }

    @Test
    public void testTwoNegativeNo() {
        BigInteger a = new BigInteger("-200");
        BigInteger b = new BigInteger("-100");
        assertTrue(a.compareTo(b) < 0); // -200 < -100
    }

    @Test
    public void testZeroCompare() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");
        assertEquals(0, a.compareTo(b)); // 0 == 0
    }
}
