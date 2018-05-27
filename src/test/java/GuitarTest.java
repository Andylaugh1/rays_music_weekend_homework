import Enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Fretboard fretboard, fretboard2;
    GuitarString guitarString, guitarString2;

    @Before
    public void before(){
        fretboard = new Fretboard("Fender", 40.00, 60.00);
        guitarString = new GuitarString("Fender", 10.00, 15.00);
        guitar = new Guitar("Fender", "Stratocaster", 300.00, 550.00, guitarString, fretboard, InstrumentType.GUITAR);
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
        assertEquals(300.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(550, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }

    @Test
    public void canGetGuitarStringPrice(){
        assertEquals(15.00, guitar.getStrings().getSellingPrice(), 0.01);
    }

    @Test
    public void canGetGuitarFretboardPrice(){
        assertEquals(60.00, guitar.getFretboard().getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeFretboard(){
        fretboard2 = new Fretboard("Fender", 20.00, 50.00);
        guitar.changeFretboard(fretboard2);
        assertEquals(50.00, guitar.getFretboard().getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeGuitarStrings(){
        guitarString2 = new GuitarString("Fender", 6.00, 11.00);
        guitar.changeStrings(guitarString2);
        assertEquals(6.00, guitar.getStrings().getBuyingPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Now playing: Kerrrrraaannnnnggg", guitar.Play());
    }

    @Test
    public void canCalculatePoundMarkup(){
        assertEquals(250.00, guitar.calculatePoundMarkup(), 0.01);
    }

    @Test
    public void canCalculatePercentageMarkup(){
        assertEquals(83.33, guitar.calculatePercentageMarkup(), 0.1);
    }
}
