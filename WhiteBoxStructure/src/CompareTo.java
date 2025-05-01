import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTo {

   
    //Statement 
    @Test
    void STC1() {
        BigInteger x = Single(3, false);
        BigInteger y = Single(5, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void STC2() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Multi(new int[]{3}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void STC3() {
        BigInteger x = Multi(new int[]{4}, false);
        BigInteger y = Multi(new int[]{4}, false);
        assertEquals(0, x.compareTo(y));
    }

    //Branch 
    @Test
    void B1() {
        BigInteger x = Single(3, false);
        BigInteger y = Single(5, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void B2() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Multi(new int[]{3}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void B3() {
        BigInteger x = Multi(new int[]{4}, false);
        BigInteger y = Multi(new int[]{4}, false);
        assertEquals(0, x.compareTo(y));
    }

    @Test
    void B4() {
        BigInteger x = Multi(new int[]{5}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    //Condition 
    @Test
    void CD1() {
        BigInteger x = Single(3, false);
        BigInteger y = Single(5, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void CD2() {
        BigInteger x = Multi(new int[]{5}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void CD3() {
        BigInteger x = Multi(new int[]{5, 0}, false);
        BigInteger y = Multi(new int[]{3}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void CD4() {
        BigInteger x = Multi(new int[]{4}, false);
        BigInteger y = Multi(new int[]{4}, false);
        assertEquals(0, x.compareTo(y));
    }

    // Condition/Decision 
    @Test
    void CDC1() {
        BigInteger x = Single(3, false);
        BigInteger y = Single(5, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void CDC2() {
        BigInteger x = Multi(new int[]{5}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void CDC3() {
        BigInteger x = Multi(new int[]{5, 0}, false);
        BigInteger y = Multi(new int[]{3}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void CDC4() {
        BigInteger x = Multi(new int[]{4}, false);
        BigInteger y = Multi(new int[]{4}, false);
        assertEquals(0, x.compareTo(y));
    }

    //Multiple Condition
    @Test
    void MCC1() {
        BigInteger x = Single(3, false);
        BigInteger y = Single(5, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCC2() {
        BigInteger x = Single(3, false);
        BigInteger y = Multi(new int[]{7}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCC3() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Single(7, false);
        // 5 < 7, so compareTo should return -1, not 1
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCC4() {
        BigInteger x = Multi(new int[]{7}, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void MCC5() {
        BigInteger x = Multi(new int[]{5}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCC6() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Multi(new int[]{5}, true);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void MCC7() {
        BigInteger x = Multi(new int[]{5}, true);
        BigInteger y = Multi(new int[]{5}, true);
        assertEquals(0, x.compareTo(y));
    }

    @Test
    void MCC8() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(0, x.compareTo(y));
    }

    @Test
    void MCC9() {
        BigInteger x = Multi(new int[]{7, 0}, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void MCC10() {
        BigInteger x = Multi(new int[]{7, 0}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCC11() {
        BigInteger x = Multi(new int[]{3}, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCC12() {
        BigInteger x = Multi(new int[]{3}, true);
        BigInteger y = Multi(new int[]{5}, false);
        // -3 < 5, so compareTo should return -1, not 1
        assertEquals(-1, x.compareTo(y));
    }

    //  Modified Condition/Decision 
    @Test
    void MCDC1() {
        BigInteger x = Single(3, false);
        BigInteger y = Single(5, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCDC2() {
        BigInteger x = Multi(new int[]{3}, false);
        BigInteger y = Single(5, false);
        // 3 < 5, so compareTo should return -1, not 1
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCDC3() {
        BigInteger x = Single(3, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCDC4() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(0, x.compareTo(y));
    }

    @Test
    void MCDC5() {
        BigInteger x = Multi(new int[]{5}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }

    @Test
    void MCDC6() {
        BigInteger x = Multi(new int[]{5}, false);
        BigInteger y = Multi(new int[]{5}, true);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void MCDC7() {
        BigInteger x = Multi(new int[]{7, 0}, false);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(1, x.compareTo(y));
    }

    @Test
    void MCDC8() {
        BigInteger x = Multi(new int[]{7, 0}, true);
        BigInteger y = Multi(new int[]{5}, false);
        assertEquals(-1, x.compareTo(y));
    }
    /**
    “Single-word” BigInteger 
       */
      private BigInteger Single(int value, boolean negative) {
          long v = negative ? -value : value;
          return BigInteger.valueOf(v);
      }

      /**
       *  “Multi-word” BigInteger 
       */
      private BigInteger Multi(int[] words, boolean negative) {
          BigInteger result = BigInteger.ZERO;
          for (int i = words.length - 1; i >= 0; i--) {
            
              result = result.shiftLeft(32)
                             .add(BigInteger.valueOf(Integer.toUnsignedLong(words[i])));
          }
          return negative ? result.negate() : result;
      }

}
