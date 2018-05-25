public class Accessory {

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
}
