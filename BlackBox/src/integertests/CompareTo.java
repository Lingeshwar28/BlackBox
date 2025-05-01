package integertests;
import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompareTo {

    @Test
    public void C1() {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("100");
        assertEquals(0, a.compareTo(b)); // 100 = 100 
    }

    @Test
    public void C2() {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("200");
        assertTrue(a.compareTo(b) < 0); // 100 < 200
    }

    @Test
    public void C3() {
        BigInteger a = new BigInteger("200");
        BigInteger b = new BigInteger("100");
        assertTrue(a.compareTo(b) > 0); // 200 > 100
    }

    @Test
    public void C4() {
        BigInteger a = new BigInteger("-100");
        BigInteger b = new BigInteger("100");
        assertTrue(a.compareTo(b) < 0); // -100 < 100
    }

    @Test
    public void C5() {
        BigInteger a = new BigInteger("-200");
        BigInteger b = new BigInteger("-100");
        assertTrue(a.compareTo(b) < 0); // -200 < -100
    }

    @Test
    public void C6() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");
        assertEquals(0, a.compareTo(b)); // 0 == 0
    }
}
