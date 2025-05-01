package integertests;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class SignumBB {

    @Test
    public void A1() {
        BigInteger actual = new BigInteger(1, new byte[] {1, 2});
        BigInteger expected = new BigInteger("258"); // 1*256 + 2 = 258
        assertEquals(expected, actual);
    }

    @Test
    public void A2() {
        BigInteger actual = new BigInteger(-1, new byte[] {3, 4});
        BigInteger expected = new BigInteger("-772"); // -(3*256 + 4) = -772
        assertEquals(expected, actual);
    }

    @Test
    public void A3() {
        BigInteger actual = new BigInteger(1, new byte[] {});
        assertEquals(BigInteger.ZERO, actual);
    }

    @Test
    public void A4() {
        BigInteger actual = new BigInteger(0, new byte[] {0, 0, 0});
        assertEquals(BigInteger.ZERO, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void A5() {
        new BigInteger(2, new byte[] {1});
    }

    @Test(expected = NumberFormatException.class)
    public void A6() {
        new BigInteger(0, new byte[] {1, 0});
    }
}
