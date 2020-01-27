import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(4.0, calculator.divide(8.0, 2.0), 0.0);
    }
}
