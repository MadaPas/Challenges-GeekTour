package earlyjava.methodclass2.cashregisterclass;

class RetailItem {
    private String description;
    private double price;
    private int unitsOnHand;

    public RetailItem(double p) {
        price = p;
    }

    public RetailItem(RetailItem i2) {
        description = i2.description;
        price = i2.price;
        unitsOnHand = i2.unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double p) {
        price = p;
    }

}
