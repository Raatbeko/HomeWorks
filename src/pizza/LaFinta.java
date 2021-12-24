package pizza;

public class LaFinta extends Pizza{
    private String souce;
    private boolean withMushrooms;
    private String whatGreenery;

    public LaFinta() {
    }

    public LaFinta(String whatGreenery,  String souce) {
        this.whatGreenery = whatGreenery;
        this.souce = souce;

    }

    @Override
    public String toString() {
        if (getAddressOfOrder()!= null){
            return "Name. La finta" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat souce . " + souce + "\nWhat greenery ." + whatGreenery +"\nBegin cooking. " + isCook()+ "\nWith delivery. " + isDelivery() + "\nDelivery order. " + getAddressOfOrder() + "\n";
        }else if (getTimeOfOrder() != null){
            return "Name. Margarita" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat souce . " + souce + "\nWhat greenery ."+ whatGreenery +"\nBegin cooking. " + isCook()+ "\nWith delivery. " + isDelivery() + "\nCooking. " + getTimeOfOrder()+"\n";
        }else {
            return "Name. Margarita" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat souce . " + souce +"\nWhat greenery ."+whatGreenery+ "\nBegin cooking. " + isCook() + "\nWith delivery. " + isDelivery()+ "\n";
        }
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public boolean isWithCheese() {
        return withMushrooms;
    }

    public void setWithCheese(boolean withCheese) {
        this.withMushrooms = withCheese;
    }

    public String getWhatGreenery() {
        return whatGreenery;
    }

    public void setWhatGreenery(String whatGreenery) {
        this.whatGreenery = whatGreenery;
    }

}
