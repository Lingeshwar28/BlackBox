package integertests;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class SignumBB {

    @Test
    public void testPositiveNonEmptyMag() {
        BigInteger actual = new BigInteger(1, new byte[] {1, 2});
        BigInteger expected = new BigInteger("258"); // 1*256 + 2 = 258
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNonEmptyMag() {
        BigInteger actual = new BigInteger(-1, new byte[] {3, 4});
        BigInteger expected = new BigInteger("-772"); // -(3*256 + 4) = -772
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyMag() {
        BigInteger actual = new BigInteger(1, new byte[] {});
        assertEquals(BigInteger.ZERO, actual);
    }

    @Test
    public void testAllZeroMag() {
        BigInteger actual = new BigInteger(0, new byte[] {0, 0, 0});
        assertEquals(BigInteger.ZERO, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidSignum() {
        new BigInteger(2, new byte[] {1});
    }

    @Test(expected = NumberFormatException.class)
    public void testZeroSignumNonZeroMag() {
        new BigInteger(0, new byte[] {1, 0});
    }
}
