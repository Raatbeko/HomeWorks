package pizza;

public class Peperoni extends Pizza{
    private String whatSausage;
    private boolean withPaperOrNot;

    public Peperoni() {

    }

    public Peperoni(  String whatPaper) {

        this.whatSausage = whatPaper;

    }

    @Override
    public String toString() {
        if (getAddressOfOrder()!= null){
            return "Name. Peperoni" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat sausage . " + whatSausage+  "\nBegin cooking. " + isCook()+ "\nWith delivery. " + isDelivery() + "\nDelivery order. " + getAddressOfOrder()+"\n";
        }else if (getTimeOfOrder() != null){
            return "Name. Peperoni" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat sausage . " + whatSausage +"\nBegin cooking. " + isCook()+ "\nWith delivery. " + isDelivery() + "\nCooking. " + getTimeOfOrder()+"\n";
        }else {
            return "Name. Peperoni" + "\nPrice. " + getPrice() + "\nScales. " + getScales() + "\nWhat sausage . " + whatSausage + "\nBegin cooking. " + isCook() + "\nWith delivery. " + isDelivery()+"\n";
        }

    }

    public String getMeat() {
        return whatSausage;
    }

    public void setMeat(String whatPaper) {
        this.whatSausage = whatPaper;
    }

    public boolean isWithPaperOrNot() {
        return withPaperOrNot;
    }

    public void setWithPaperOrNot(boolean withPaperOrNot) {
        this.withPaperOrNot = withPaperOrNot;
    }
}
