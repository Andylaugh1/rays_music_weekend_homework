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

    public void addInstrument(Instrument instrument) {
        instrumentStock.add(instrument);
    }

    public void addAccessory(Accessory accessory) {
        accessoryStock.add(accessory);
    }

    public double calculateInstrumentPoundMarkup() {
        double totalPoundMarkup = 0;
        for (Instrument instrument : instrumentStock){
            totalPoundMarkup += instrument.calculatePoundMarkup();
        }
        return totalPoundMarkup;
    }

    public double calculateAverageInstrumentPercentageMarkup() {
        double totalPercentMarkup = 0;
        for (Instrument instrument : instrumentStock){
            totalPercentMarkup += instrument.calculatePercentageMarkup();
        }
        return totalPercentMarkup / countInstrumentStock();
    }

    public double calculateAccessoriesPoundMarkup() {
        double totalPoundMarkup = 0;
        for (Accessory accessory : accessoryStock){
            totalPoundMarkup += accessory.calculatePoundMarkup();
        }
        return totalPoundMarkup;
    }

    public double calculateAverageAccessoryPercentageMarkup() {
        double totalPercentMarkup = 0;
        for (Accessory accessory : accessoryStock){
            totalPercentMarkup += accessory.calculatePercentageMarkup();
        }
        return totalPercentMarkup / countAccessoryStock();
    }
}
