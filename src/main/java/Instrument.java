import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make;
    private String model;
    private double buyingPrice;
    private double sellingPrice;
    private InstrumentType instrumentType;

    public Instrument(String make, String model, double buyingPrice, double sellingPrice, InstrumentType instrumentType){
        this.make = make;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.instrumentType = instrumentType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public InstrumentType getInstrumentType(){
        return instrumentType;
    }

    public abstract String Play();

    public double calculatePoundMarkup(){
        return sellingPrice - buyingPrice;
    }

    public double calculatePercentageMarkup(){
        return (calculatePoundMarkup() / buyingPrice) * 100;
    }
}
