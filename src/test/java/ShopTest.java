import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument instrument;
    GuitarString guitarString,guitarString2;
    Fretboard fretboard;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Store");
        guitarString = new GuitarString("Fender", 10.00, 15.00);
        fretboard = new Fretboard("Fender", 40.00, 60.00);
        instrument = new Guitar("Fender", "Stratocaster", 200.00, 550.00, guitarString, fretboard);
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Store", shop.getName());
    }

    @Test
    public void canCountInstrumentStock(){
        assertEquals(0, shop.countInstrumentStock());
    }

    @Test
    public void canCountAccessoryStock(){
        assertEquals(0, shop.countAccessoryStock() );
    }

    @Test
    public void canAddInstrumentToStock(){
        shop.addInstrument(instrument);
        assertEquals(1, shop.countInstrumentStock());
    }
}
