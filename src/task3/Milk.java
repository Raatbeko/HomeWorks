package task3;

import task3.task3Product.Product;

import java.util.Arrays;

public class Milk extends Product {
    private String pullDate;

    public Milk(String pullDate) {
        this.pullDate = pullDate;
    }

    public Milk(String name, String price, String[] composition, String pullDate) {
        super(name, price, composition);
        this.pullDate = pullDate;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nPrice:" + price + "\nComposition:" + Arrays.toString(composition) + "\nPull-Date:" + pullDate;
    }

    public String getPullDate() {
        return pullDate;
    }

    public void setPullDate(String pullDate) {
        this.pullDate = pullDate;
    }
}
