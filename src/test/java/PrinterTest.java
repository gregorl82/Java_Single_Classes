import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(20);
    }

    @Test
    public void hasPaper(){
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(3, 2);
        assertEquals(14, printer.getPaper());
    }

    @Test
    public void notEnoughPaper(){
        printer.print(6, 4);
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(20, printer.getToner());
    }

    @Test
    public void printingReducesToner(){
        printer.print(1, 1);
        assertEquals(19, printer.getToner());
    }
}
