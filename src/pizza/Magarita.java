package pizza;

public class Magarita extends Pizza{
    private String whatMeat;
    private boolean withMeatOrNot;

    public Magarita() {
    }

    public Magarita( String whatMeat) {
        this.whatMeat = whatMeat;

    }

    @Override
    public String toString() {
        if (getAddressOfOrder()!= null){
            return "Name. Margarita" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat meat. " + whatMeat +"\nBegin cooking. " + isCook()+ "\nWith delivery. " + isDelivery() + "\nDelivery order. " + getAddressOfOrder()+"\n";
        }else if (getTimeOfOrder() != null){
            return "Name. Margarita" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat meat. " + whatMeat +"\nBegin cooking. " + isCook()+ "\nWith delivery. " + isDelivery() + "\nCooking. " + getTimeOfOrder()+"\n";
        }else {
            return "Name. Margarita" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat meat. " + whatMeat + "\nBegin cooking. " + isCook() + "\nWith delivery. " + isDelivery()+"\n";
        }
    }

    public String getWhatMeat() {
        return whatMeat;
    }

    public void setWhatMeat(String whatMeat) {
        this.whatMeat = whatMeat;
    }

    public boolean isWithMeatOrNot() {
        return withMeatOrNot;
    }

    public void setWithMeatOrNot(boolean withMeatOrNot) {
        this.withMeatOrNot = withMeatOrNot;
    }
}
