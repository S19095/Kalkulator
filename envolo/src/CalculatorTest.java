
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalculator() throws Exception {
        Calculator calTest = new Calculator();
        //add-TEST
        assertEquals(0, calTest.add(0,0));
        assertEquals( 1, calTest.add(1,0));
        assertEquals( 122, calTest.add(123,-1));
        assertEquals( 2, calTest.add(-5,7));
        assertEquals(0, calTest.add(-3,3));
        assertEquals( 48, calTest.add(24,24));
        assertEquals( 783214342, calTest.add(783214341,1));
        //subtract-TEST
        assertEquals( 2, calTest.subtract(-3,-5));
        assertEquals( 2, calTest.subtract(1,-1));
        assertEquals( 0, calTest.subtract(100,100));
        assertEquals( 27, calTest.subtract(13,-14));
        assertEquals( 15, calTest.subtract(15,0));
        assertEquals( 1, calTest.subtract(2,1));
        assertEquals( 0, calTest.subtract(0,0));
        //multiply-TEST
        assertEquals( 0, calTest.multiply(1,0));
        assertEquals( 12, calTest.multiply(3,4));
        assertEquals( 2000, calTest.multiply(100,20));
        assertEquals( -1, calTest.multiply(-1,1));
        assertEquals( -340, calTest.multiply(340,-1));
        assertEquals( 1560, calTest.multiply(780,2));
        assertEquals( 169, calTest.multiply(13,13));
        //power-TEST
        assertEquals( 1, calTest.power(1,0));
        assertEquals( 0, calTest.power(2,-1));
        assertEquals( 56, calTest.power(56,1));
        assertEquals( 4, calTest.power(2,2));
        assertEquals( 16, calTest.power(4,2));
        assertEquals( 4096, calTest.power(8,4));
        assertEquals( 1, calTest.power(0,0));
        //divide-TEST
        assertEquals( -1.0, calTest.divide(1,-1),0.000);
        assertEquals( 0.0, calTest.divide(12,0),0.000);
        assertEquals(26.0, calTest.divide(13,0.5),0.000);
        assertEquals( 3.333, calTest.divide(10,3),0.000);
        assertEquals( 1.34, calTest.divide(472,352),0.000);
        assertEquals( 0.35, calTest.divide(4.44,12.66),0.000);
        assertEquals(1, calTest.divide(0.5,0.5),0.000);
        //factorial-TEST
        assertEquals( 1, calTest.factorial(1));
        assertEquals( 2, calTest.factorial(2));
        assertEquals(6, calTest.factorial(3));
        assertEquals( 24, calTest.factorial(4));
        assertEquals( 5040, calTest.factorial(7));
        assertEquals(3628800, calTest.factorial(10));
        //xProcentOfy-TEST
        assertEquals( 8.880, calTest.xProcentOfy(20.0,44.4),0.000);
        assertEquals( 10.0, calTest.xProcentOfy(10,100),0.000);
        assertEquals( 5.0, calTest.xProcentOfy(50.0,10),0.000);
        assertEquals( 88.8, calTest.xProcentOfy(200,44.4),0.000);
        assertEquals( 2.0, calTest.xProcentOfy(2,100),0.000);
        assertEquals( 0.0, calTest.xProcentOfy(-20.0,44.4),0.000);
        assertEquals( 0.0, calTest.xProcentOfy(0.0,0.0),0.000);
        assertEquals( 44.4, calTest.xProcentOfy(100.0,44.4),0.000);
    }
}
