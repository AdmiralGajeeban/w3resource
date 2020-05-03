import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class numbersTest {

    Numbers number = new Numbers();
    int a = 4;
    int b = 3;

    @Test
    public void testAdd(){
        int c = number.add(a,b);
        assertEquals (c,7);
    }

    @Test
    public void testSubtract(){
        int c = number.subtract(a,b);
        assertEquals(c,1);
    }

    @Test
    public void testMultiply(){
        int c = number.multiply(a,b);
        assertEquals(c,12);
    }

    @Test
    public void testDivide(){
        int c = number.divide(a,b);
        assertEquals(c,1);
    }

    @Test
    public void testMod(){
        int c = number.remainder(a,b);
        assertEquals(c,1);
    }

}
