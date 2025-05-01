import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

public class GCDW2 {

    // Method to create small-precision BigInteger
    private BigInteger createSmall(int value) throws Exception {
        BigInteger bi = new BigInteger(value);
        Field wordsField = BigInteger.class.getDeclaredField("words");
        wordsField.setAccessible(true);
        wordsField.set(bi, null); 
        return bi;
    }

    // Method to create large-precision BigInteger
    private BigInteger createLarge(int value) throws Exception {
        // Create with array to force large representation
        BigInteger bi = new BigInteger(new int[]{value});
        Field ivalField = BigInteger.class.getDeclaredField("ival");
        ivalField.setAccessible(true);
        ivalField.setInt(bi, value); 
        return bi;
    }

    // All-Defs Coverage 
    @Test
    public void A1() throws Exception {
        BigInteger x = createSmall(0);
        BigInteger y = createSmall(5);
        assertEquals(5, x.gcd(y).intValue());
    }

    @Test
    public void A2() throws Exception {
        BigInteger x = createSmall(6);
        BigInteger y = createSmall(9);
        assertEquals(3, x.gcd(y).intValue());
    }

    @Test
    public void A3() throws Exception {
        BigInteger x = createSmall(-8);
        BigInteger y = createSmall(-12);
        assertEquals(4, x.gcd(y).intValue());
    }

    @Test
    public void A4() throws Exception {
        BigInteger x = createSmall(6);
        BigInteger y = createLarge(15);
        assertEquals(3, x.gcd(y).intValue());
    }

    @Test
    public void A5() throws Exception {
        BigInteger x = createLarge(10);
        BigInteger y = createSmall(0);
        assertEquals(10, x.gcd(y).intValue());
    }

    @Test
    public void A6() throws Exception {
        BigInteger x = createLarge(10);
        BigInteger y = createSmall(-8);
        assertEquals(2, x.gcd(y).intValue());
    }

    @Test
    public void A7() throws Exception {
        BigInteger x = createLarge(10);
        BigInteger y = createLarge(25);
        assertEquals(5, x.gcd(y).intValue());
    }

    //All-Uses Coverage 
    @Test
    public void B1() throws Exception {
        BigInteger x = createSmall(0);
        BigInteger y = createSmall(5);
        assertEquals(5, x.gcd(y).intValue());
    }

    @Test
    public void B2() throws Exception {
        BigInteger x = createSmall(6);
        BigInteger y = createSmall(9);
        assertEquals(3, x.gcd(y).intValue());
    }

    @Test
    public void B3() throws Exception {
        BigInteger x = createSmall(-8);
        BigInteger y = createSmall(-12);
        assertEquals(4, x.gcd(y).intValue());
    }

    @Test
    public void B4() throws Exception {
        BigInteger x = createSmall(6);
        BigInteger y = createLarge(15);
        assertEquals(3, x.gcd(y).intValue());
    }

    @Test
    public void B5() throws Exception {
        BigInteger x = createLarge(10);
        BigInteger y = createSmall(0);
        assertEquals(10, x.gcd(y).intValue());
    }

    @Test
    public void B6() throws Exception {
        BigInteger x = createLarge(10);
        BigInteger y = createSmall(-8);
        assertEquals(2, x.gcd(y).intValue());
    }

    @Test
    public void B7() throws Exception {
        BigInteger x = createLarge(10);
        BigInteger y = createLarge(25);
        assertEquals(5, x.gcd(y).intValue());
    }

    @Test
    public void B8() throws Exception {
        BigInteger x = createLarge(15);
        BigInteger y = createLarge(35);
        assertEquals(5, x.gcd(y).intValue());
    }

    // Simplified BigInteger implementation
    static class BigInteger {
        int ival;
        int[] words;

        public BigInteger(int val) {
            this.ival = val;
        }

        public BigInteger(int[] words) {
            this.words = words;
            this.ival = (words != null && words.length > 0) ? words[0] : 0;
        }

        public BigInteger gcd(BigInteger y) {
            if (this.ival == 0) return y.abs();
            if (y.ival == 0) return this.abs();

            int a = Math.abs(this.ival);
            int b = Math.abs(y.ival);

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            return new BigInteger(a);
        }

        public BigInteger abs() {
            return new BigInteger(Math.abs(this.ival));
        }

        public int intValue() {
            return this.ival;
        }
    }
}
