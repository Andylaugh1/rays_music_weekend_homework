public class Instrument {

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
}
