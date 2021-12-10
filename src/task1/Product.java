package task1;

public class Product {
    private String name;
    private String price;
    private String pullDate;

    public Product(String pullDate) {
        this.pullDate = pullDate;
    }

    public Product(String name, String price, String pullDate) {
        this.name = name;
        this.price = price;
        this.pullDate = pullDate;
    }

    @Override
    public String toString() {
        return "Name:" +name+ "\n" +"Price:" +price+"\n"+"Pull-date:" + pullDate;
    }

    public String getPullDate() {
        return pullDate;
    }

    public void setPullDate(String pullDate) {
        this.pullDate = pullDate;
    }
}
