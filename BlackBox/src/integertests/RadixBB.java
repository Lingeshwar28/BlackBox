package integertests;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class RadixBB {

    @Test
    public void B1() {
        BigInteger actual = new BigInteger("+123", 10);
        BigInteger expected = new BigInteger("123");
        assertEquals(expected, actual);
    }

    @Test
    public void B2() {
        BigInteger actual = new BigInteger("-123", 10);
        BigInteger expected = new BigInteger("-123");
        assertEquals(expected, actual);
    }

    @Test
    public void B3() {
        BigInteger actual = new BigInteger("789", 10);
        BigInteger expected = new BigInteger("789");
        assertEquals(expected, actual);
    }

    @Test
    public void B4() {
        BigInteger actual = new BigInteger("A7", 16);
        BigInteger expected = new BigInteger("167"); // A7₁₆ = 167
        assertEquals(expected, actual);
    }

    @Test
    public void B5() {
        BigInteger actual = new BigInteger("00045", 10);
        BigInteger expected = new BigInteger("45");
        assertEquals(expected, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void B6() {
        new BigInteger("12G", 10);
    }

    @Test(expected = NumberFormatException.class)
    public void B7() {
        new BigInteger("19", 8); // '9' is not a valid octal digit
    }

    @Test(expected = NumberFormatException.class)
    public void B8() {
        new BigInteger("", 10);
    }

    @Test(expected = NumberFormatException.class)
    public void B9() {
        new BigInteger("123", 1); // Radix must be >= Character.MIN_RADIX
    }

    @Test(expected = NumberFormatException.class)
    public void B10() {
        new BigInteger("123", 37); // Radix must be <= Character.MAX_RADIX
    }

    @Test(expected = NumberFormatException.class)
    public void B11() {
        new BigInteger(" 123", 10);
    }
}
