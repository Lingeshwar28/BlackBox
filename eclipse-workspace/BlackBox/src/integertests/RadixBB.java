package integertests;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class RadixBB {

    @Test
    public void testPositiveWithExplicitPlus() {
        BigInteger actual = new BigInteger("+123", 10);
        BigInteger expected = new BigInteger("123");
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNo() {
        BigInteger actual = new BigInteger("-123", 10);
        BigInteger expected = new BigInteger("-123");
        assertEquals(expected, actual);
    }

    @Test
    public void testNoWithoutSign() {
        BigInteger actual = new BigInteger("789", 10);
        BigInteger expected = new BigInteger("789");
        assertEquals(expected, actual);
    }

    @Test
    public void testHexaRep() {
        BigInteger actual = new BigInteger("A7", 16);
        BigInteger expected = new BigInteger("167"); // A7₁₆ = 167
        assertEquals(expected, actual);
    }

    @Test
    public void testLeadZeros() {
        BigInteger actual = new BigInteger("00045", 10);
        BigInteger expected = new BigInteger("45");
        assertEquals(expected, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidCharForRadix() {
        new BigInteger("12G", 10);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidDigitInRadix() {
        new BigInteger("19", 8); // '9' is not a valid octal digit
    }

    @Test(expected = NumberFormatException.class)
    public void testEmptyString() {
        new BigInteger("", 10);
    }

    @Test(expected = NumberFormatException.class)
    public void testRadixBelowRange() {
        new BigInteger("123", 1); // Radix must be >= Character.MIN_RADIX
    }

    @Test(expected = NumberFormatException.class)
    public void testRadixAboveRange() {
        new BigInteger("123", 37); // Radix must be <= Character.MAX_RADIX
    }

    @Test(expected = NumberFormatException.class)
    public void testExtraWhitespace() {
        new BigInteger(" 123", 10);
    }
}
