import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Fretboard fretboard;
    GuitarString guitarString;

    @Before
    public void before(){
        fretboard = new Fretboard("Fender", 40.00, 60.00);
        guitarString = new GuitarString("Fender", 10.00, 15.00);
        guitar = new Guitar("Fender", "Stratocaster", 200.00, 550.00, guitarString, fretboard);
    }

    @Test
    public void canGetMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(200.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(550, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetGuitarStringPrice(){
        assertEquals(15.00, guitar.getStrings().getSellingPrice(), 0.01);
    }

    @Test
    public void canGetGuitarFretboardPrice(){
        assertEquals(60.00, guitar.getFretboard().getSellingPrice(), 0.01);
    }
}
