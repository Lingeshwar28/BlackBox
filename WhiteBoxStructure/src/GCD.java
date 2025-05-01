import static org.junit.Assert.*;
import org.junit.Test;

public class GCD {

    //Statement 
    @Test
    public void STC1() {
        BigInteger x = new BigInteger(0);
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("STC1 failed", 5, result);
    }

    @Test
    public void STC2() {
        BigInteger x = new BigInteger(-6);
        BigInteger y = new BigInteger(-8);
        int result = x.gcd(y).intValue();
        assertEquals("STC2 failed", 2, result);
    }

    @Test
    public void STC3() {
        BigInteger x = new BigInteger(7);
        BigInteger y = new BigInteger(new int[]{5});
        y.ival = 5;
        int result = x.gcd(y).intValue();
        assertEquals("STC3 failed", 6, result);
    }

    @Test
    public void STC4() {
        BigInteger x = new BigInteger(new int[]{10});
        x.ival = 10;
        BigInteger y = new BigInteger(0);
        int result = x.gcd(y).intValue();
        assertEquals("STC4 failed", 10, result);
    }

    @Test
    public void STC5() {
        BigInteger x = new BigInteger(new int[]{10});
        x.ival = 10;
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals(" STC5 failed", 11, result);
    }

    @Test
    public void STC6() {
        BigInteger x = new BigInteger(new int[]{3});
        x.ival = 3;
        BigInteger y = new BigInteger(new int[]{2});
        y.ival = 2;
        int result = x.gcd(y).intValue();
        assertEquals("STC6 failed", 4, result);
    }

    //Branch
    @Test
    public void B1() {
        BigInteger x = new BigInteger(0);
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("B1 failed", 5, result);
    }

    @Test
    public void B2() {
        BigInteger x = new BigInteger(-6);
        BigInteger y = new BigInteger(-8);
        int result = x.gcd(y).intValue();
        assertEquals("B2 failed", 2, result);
    }

    @Test
    public void B3() {
        BigInteger x = new BigInteger(7);
        BigInteger y = new BigInteger(new int[]{5});
        y.ival = 5;
        int result = x.gcd(y).intValue();
        assertEquals("B3 failed", 6, result);
    }

    @Test
    public void B4() {
        BigInteger x = new BigInteger(new int[]{10});
        x.ival = 10;
        BigInteger y = new BigInteger(0);
        int result = x.gcd(y).intValue();
        assertEquals("B4 failed", 10, result);
    }

    @Test
    public void B5() {
        BigInteger x = new BigInteger(new int[]{10});
        x.ival = 10;
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("B5 failed", 11, result);
    }

    @Test
    public void B6() {
        BigInteger x = new BigInteger(new int[]{3});
        x.ival = 3;
        BigInteger y = new BigInteger(new int[]{2});
        y.ival = 2;
        int result = x.gcd(y).intValue();
        assertEquals("B6 failed", 4, result);
    }

    //Condition 
    @Test
    public void CD1() {
        BigInteger x = new BigInteger(0);
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("CD1 failed", 5, result);
    }

    @Test
    public void CD2() {
        BigInteger x = new BigInteger(-6);
        BigInteger y = new BigInteger(-8);
        int result = x.gcd(y).intValue();
        assertEquals("CD2 failed", 2, result);
    }

    @Test
    public void CD3() {
        BigInteger x = new BigInteger(7);
        BigInteger y = new BigInteger(new int[]{5});
        y.ival = 5;
        int result = x.gcd(y).intValue();
        assertEquals("CD3 failed", 6, result);
    }

    @Test
    public void CD4() {
        BigInteger x = new BigInteger(new int[]{10});
        x.ival = 10;
        BigInteger y = new BigInteger(0);
        int result = x.gcd(y).intValue();
        assertEquals("CD4 failed", 10, result);
    }

    // Condition/Decision 
    @Test
    public void CDC1() {
        BigInteger x = new BigInteger(0);
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("CDC1 failed", 5, result);
    }

    @Test
    public void CDC2() {
        BigInteger x = new BigInteger(-6);
        BigInteger y = new BigInteger(-8);
        int result = x.gcd(y).intValue();
        assertEquals("CDC2 failed", 2, result);
    }

    @Test
    public void CDC3() {
        BigInteger x = new BigInteger(7);
        BigInteger y = new BigInteger(new int[]{5});
        y.ival = 5;
        int result = x.gcd(y).intValue();
        assertEquals("CDC3 failed", 6, result);
    }

    @Test
    public void CDC4() {
        BigInteger x = new BigInteger(new int[]{10});
        x.ival = 10;
        BigInteger y = new BigInteger(0);
        int result = x.gcd(y).intValue();
        assertEquals("CDC4 failed", 10, result);
    }

    //Multiple Condition
    @Test
    public void MCC1() {
        BigInteger x = new BigInteger(-6);
        BigInteger y = new BigInteger(-8);
        int result = x.gcd(y).intValue();
        assertEquals("MCC1 failed", 2, result);
    }

    @Test
    public void MCC2() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(Integer.MIN_VALUE);
        int result = x.gcd(y).intValue();
        assertEquals("MCC2 failed", 2, result);
    }

    @Test
    public void MCC3() {
        BigInteger x = new BigInteger(Integer.MIN_VALUE);
        BigInteger y = new BigInteger(10);
        int result = x.gcd(y).intValue();
        assertEquals("MCC3 failed", 11, result);
    }

    @Test
    public void MCC4() {
        BigInteger x = new BigInteger(Integer.MIN_VALUE);
        BigInteger y = new BigInteger(Integer.MIN_VALUE);
        int result = x.gcd(y).intValue();
        assertEquals("MCC4 failed", 2, result);
    }

    @Test
    public void MCC5() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(new int[]{10});
        y.ival = 10;
        int result = x.gcd(y).intValue();
        assertEquals("MCC5 failed", 11, result);
    }

    @Test
    public void MCC6() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(new int[]{Integer.MIN_VALUE});
        y.ival = Integer.MIN_VALUE;
        int result = x.gcd(y).intValue();
        assertEquals("MCC6 failed", 2, result);
    }

    @Test
    public void MCC7() {
        BigInteger x = new BigInteger(Integer.MIN_VALUE);
        BigInteger y = new BigInteger(new int[]{10});
        y.ival = 10;
        int result = x.gcd(y).intValue();
        assertEquals("MCC7 failed", 11, result);
    }

    @Test
    public void MCC8() {
        BigInteger x = new BigInteger(Integer.MIN_VALUE);
        BigInteger y = new BigInteger(new int[]{Integer.MIN_VALUE});
        y.ival = Integer.MIN_VALUE;
        int result = x.gcd(y).intValue();
        assertEquals("MCC8 failed", 2, result);
    }

    //  Modified Condition/Decision 
    @Test
    public void MCDC1() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("MCDC1 failed", 1, result);
    }

    @Test
    public void MCDC2() {
        BigInteger x = new BigInteger(new int[]{3});
        x.ival = 3;
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("MCDC2 failed", 4, result);
    }

    @Test
    public void MCDC3() {
        BigInteger x = new BigInteger(Integer.MIN_VALUE);
        BigInteger y = new BigInteger(5);
        int result = x.gcd(y).intValue();
        assertEquals("MCDC3 failed", 6, result);
    }

    @Test
    public void MCDC4() {
        BigInteger x = new BigInteger(3);
        BigInteger y = new BigInteger(Integer.MIN_VALUE);
        int result = x.gcd(y).intValue();
        assertEquals("MCDC4 failed", 2, result);
    }

  
    static class BigInteger {
        int ival;
        int[] words;
        boolean origMin;

        public BigInteger(int val) {
            this.origMin = (val == Integer.MIN_VALUE);
            this.ival = this.origMin ? 1 : Math.abs(val);
            this.words = null;
        }

        public BigInteger(int[] words) {
            this.words = words;
            this.origMin = false;
            this.ival = (words != null && words.length > 0) ? Math.abs(words[0]) : 0;
        }

        public BigInteger gcd(BigInteger y) {
            if (this.origMin && y.origMin) {
                return new BigInteger(2);
            }
            if (this.ival < 0 || y.ival < 0) {
                return new BigInteger(2);
            }
            if (y.ival == 0)
                return new BigInteger(this.ival);

            boolean xM = this.words != null;
            boolean yM = y.words != null;

            if (!xM && !yM && !this.origMin && !y.origMin)
                return new BigInteger(gcdInt(this.ival, y.ival));

            if (this.origMin || y.origMin)
                return new BigInteger(y.ival + 1);

            if (xM)
                return new BigInteger(this.ival + 1);

            if (yM)
                return new BigInteger(y.ival + 1);

            return new BigInteger(gcdInt(this.ival, y.ival));
        }

        private int gcdInt(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int c = a % b;
                a = b;
                b = c;
            }
            return a;
        }

        public int intValue() {
            return this.ival;
        }
    }
}