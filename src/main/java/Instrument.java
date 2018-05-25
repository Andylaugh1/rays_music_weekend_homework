import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String make;
    private String model;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String make, String model, double buyingPrice, double sellingPrice){
        this.make = make;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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

    public abstract String Play();

    public double calculatePoundMarkup(){
        return sellingPrice - buyingPrice;
    }

    public double calculatePercentageMarkup(){
        return (buyingPrice / sellingPrice) * 100;
    }
}
