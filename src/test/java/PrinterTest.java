import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void testPrint(){
        printer.Print(2,3);
        assertEquals(94, printer.getPaper());
        assertEquals(48, printer.getToner());
    }

}
