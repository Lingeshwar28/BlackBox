import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToW2{
    static class BigInteger {
        int ival;
        int[] words;

        // Small constructor
        public BigInteger(int val) {
            this.ival = val;
            this.words = null;
        }

        // Large constructor based on string
        public BigInteger(String val) {
            this.ival = Math.abs(Integer.parseInt(val));
            if (this.ival > 10) {
                this.words = new int[]{this.ival};
            } else {
                this.words = null;
            }
            if (val.startsWith("-")) {
                this.ival = -this.ival;
            }
        }

        public boolean isNegative() {
            return this.ival < 0;
        }
    }

    // Simulated compareTo method from source code
    private static int compareTo(BigInteger x, BigInteger y) {
        if (x.words == null && y.words == null)
            return x.ival < y.ival ? -1 : x.ival > y.ival ? 1 : 0;

        boolean x_negative = x.isNegative();
        boolean y_negative = y.isNegative();

        if (x_negative != y_negative)
            return x_negative ? -1 : 1;

        int x_len = x.words == null ? 1 : x.ival;
        int y_len = y.words == null ? 1 : y.ival;

        if (x_len != y_len)
            return (x_len > y_len) != x_negative ? 1 : -1;

        return 0; 
    }

    
    // All-Defs Coverage Tests


    @Test
    public void A1() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(5);
        assertEquals(-1, compareTo(x, y));
    }

    @Test
    public void A2() {
        BigInteger x = new BigInteger(7);
        BigInteger y = new BigInteger(3);
        assertEquals(1, compareTo(x, y));
    }

    @Test
    public void A3() {
        BigInteger x = new BigInteger(5);
        BigInteger y = new BigInteger(5);
        assertEquals(0, compareTo(x, y));
    }

    @Test
    public void A4() {
        BigInteger x = new BigInteger("-15");
        BigInteger y = new BigInteger("15");
        assertEquals(-1, compareTo(x, y));
    }

    @Test
    public void A5() {
        BigInteger x = new BigInteger("15");
        BigInteger y = new BigInteger("-15");
        assertEquals(1, compareTo(x, y));
    }

    @Test
    public void A6() {
        BigInteger x = new BigInteger("15");
        BigInteger y = new BigInteger(3);
        assertEquals(1, compareTo(x, y));
    }

    @Test
    public void A7() {
        BigInteger x = new BigInteger("10");
        BigInteger y = new BigInteger("25");
        assertEquals(-1, compareTo(x, y));
    }

    @Test
    public void A8() {
        BigInteger x = new BigInteger("15");
        BigInteger y = new BigInteger("15");
        assertEquals(0, compareTo(x, y));
    }

    @Test
    public void B1() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(5);
        assertEquals(-1, compareTo(x, y));
    }

    @Test
    public void B2() {
        BigInteger x = new BigInteger(7);
        BigInteger y = new BigInteger(3);
        assertEquals(1, compareTo(x, y));
    }

    @Test
    public void B3() {
        BigInteger x = new BigInteger(5);
        BigInteger y = new BigInteger(5);
        assertEquals(0, compareTo(x, y));
    }

    @Test
    public void B4() {
        BigInteger x = new BigInteger("-15");
        BigInteger y = new BigInteger("15");
        assertEquals(-1, compareTo(x, y));
    }

    @Test
    public void B5() {
        BigInteger x = new BigInteger("15");
        BigInteger y = new BigInteger("-15");
        assertEquals(1, compareTo(x, y));
    }

    @Test
    public void B6() {
        BigInteger x = new BigInteger("15");
        BigInteger y = new BigInteger(3);
        assertEquals(1, compareTo(x, y));
    }

    @Test
    public void B7() {
        BigInteger x = new BigInteger("10");
        BigInteger y = new BigInteger("25");
        assertEquals(-1, compareTo(x, y));
    }

    @Test
    public void B8() {
        BigInteger x = new BigInteger("15");
        BigInteger y = new BigInteger("15");
        assertEquals(0, compareTo(x, y));
    }

    @Test
    public void B9() {
        BigInteger x = new BigInteger("-15");
        BigInteger y = new BigInteger("-15");
        assertEquals(0, compareTo(x, y));
    }
}
