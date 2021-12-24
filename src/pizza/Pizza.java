package pizza;

public class Pizza {
    private int price;
    private double scales;
    private String cook;
    private String timeOfOrder;
    private boolean delivery;
    private String addressOfOrder;

    public Pizza() {
    }

    public Pizza(int price, double scales) {
        this.price = price;
        this.scales = scales;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getScales() {
        return scales;
    }

    public void setScales(double scales) {
        this.scales = scales;
    }

    public String isCook() {
        return cook;
    }

    public String getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(String timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public String getAddressOfOrder() {
        return addressOfOrder;
    }

    public void setAddressOfOrder(String addressOfOrder) {
        this.addressOfOrder = addressOfOrder;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}
