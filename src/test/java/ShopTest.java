import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument instrument1, instrument2;
    GuitarString guitarString,guitarString2;
    Fretboard fretboard;
    Accessory accessory;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Store");
        guitarString = new GuitarString("Fender", 10.00, 15.00);
        fretboard = new Fretboard("Fender", 40.00, 60.00);
        instrument1 = new Guitar("Fender", "Stratocaster", 200.00, 550.00, guitarString, fretboard);
        accessory = new Fretboard("Buffalo", 100.00, 120.00);
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
        shop.addInstrument(instrument1);
        assertEquals(1, shop.countInstrumentStock());
    }

    @Test
    public void  canAddAccessoryToStock(){
        shop.addAccessory(accessory);
        assertEquals(1, shop.countAccessoryStock());
    }

    @Test
    public void canCalculatePoundMarkupForInstruments(){
        instrument2 = new Guitar("Gibson", "Les Paul", 300.00, 500.00, guitarString, fretboard);
        shop.addInstrument(instrument1);
        shop.addInstrument(instrument2);
        assertEquals(2, shop.countInstrumentStock());
        assertEquals(550.00, shop.calculateInstrumentPoundMarkup(), 0.01);
    }

    @Test
    public void canCalculateAveragePercentageMarkupForInsruments(){
        instrument2 = new Guitar("Gibson", "Les Paul", 300.00, 500.00, guitarString, fretboard);
        shop.addInstrument(instrument1);
        shop.addInstrument(instrument2);
        assertEquals(120.84, shop.calculateAverageInstrumentPercentageMarkup(), 0.01);
    }

    @Test
    public void canCalculatePoundMarkupForAccessories(){
        shop.addAccessory(accessory);
        assertEquals(20.00, shop.calculateAccessoriesPoundMarkup(), 0.01);
    }

    @Test
    public void canCalculatePercentageMarkupForAccessories(){
        shop.addAccessory(accessory);
        assertEquals(20.00, shop.calculateAverageAccessoryPercentageMarkup(), 0.01);
    }

    @Test
    public void canCalculateTotalProfitForShop(){
        instrument2 = new Guitar("Gibson", "Les Paul", 300.00, 500.00, guitarString, fretboard);
        shop.addInstrument(instrument1);
        shop.addInstrument(instrument2);
        shop.addAccessory(accessory);
        assertEquals(570.00, shop.calculateTotalProfit(), 0.01);
    }
}
