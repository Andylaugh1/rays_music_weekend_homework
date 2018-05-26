import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Store");
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Store", shop.getName());
    }
}
