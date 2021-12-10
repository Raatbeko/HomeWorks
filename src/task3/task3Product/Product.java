package task3.task3Product;

public class Product {
    protected String name;
    protected String price;
    protected String[] composition;

    public Product() {
    }

    public Product(String name, String price, String[] composition) {
        this.name = name;
        this.price = price;
        this.composition = composition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }
}
