import Interfaces.ISell;

public class Accessory implements ISell {

    private String make;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(String make, double buyingPrice, double sellingPrice){
        this.make = make;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void changeBuyingPrice(double newBuyingPrice) {
        this.buyingPrice = newBuyingPrice;
    }

    public void changeSellingPrice(double newSellingPrice) {
        this.sellingPrice = newSellingPrice;
    }

    public double calculatePoundMarkup(){
        return sellingPrice - buyingPrice;
    }
}
