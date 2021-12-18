package bus.passangers;

public class Passangers {
    private String name;
    public static int count = 0;
    private int price;
    public static long sumOfPrice = 0;

    public Passangers() {
        count++;
    }

    public Passangers(String name,int price) {
        this.name = name;
        this.price = price;
        count ++;
        sumOfPrice += price;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nPrice: " + price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
