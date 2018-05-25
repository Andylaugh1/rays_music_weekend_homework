import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FretboardTest {

    Fretboard fretboard;

    @Before
    public void before(){
        fretboard = new Fretboard("Fender", 40.00, 60.00);
    }

    @Test
    public void canGetMake(){
        assertEquals("Fender", fretboard.getMake());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(40.00, fretboard.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(60.00, fretboard.getSellingPrice(), 0.01);
    }


}
