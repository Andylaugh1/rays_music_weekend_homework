import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instrument> instrumentStock;
    private ArrayList<Accessory> accessoryStock;

    public Shop(String name){
        this.name = name;
        this.instrumentStock = new ArrayList<>();
        this.accessoryStock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countInstrumentStock() {
        return instrumentStock.size();
    }

    public int countAccessoryStock() {
        return accessoryStock.size();
    }
}
