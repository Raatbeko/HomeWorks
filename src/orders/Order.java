package orders;

import product.Product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;


public class Order {
    private int numberOfOrder;
    private LocalDate dateOrders;
    private LocalTime timeOrders;
    private ArrayList<Product> products;

    public Order() {
    }

    public Order(int numberOfOrder, LocalDate dateOrders, LocalTime timeOrders, ArrayList<Product> products) {
        this.numberOfOrder = numberOfOrder;
        this.dateOrders = dateOrders;
        this.timeOrders = timeOrders;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "numberOfOrder=" + numberOfOrder +
                ", dateOrders=" + dateOrders +
                ", timeOrders=" + timeOrders +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOfOrder == order.numberOfOrder && Objects.equals(dateOrders, order.dateOrders) && Objects.equals(timeOrders, order.timeOrders) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfOrder, dateOrders, timeOrders, products);
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public LocalDate getDateOrders() {
        return dateOrders;
    }

    public void setDateOrders(LocalDate dateOrders) {
        this.dateOrders = dateOrders;
    }

    public LocalTime getTimeOrders() {
        return timeOrders;
    }

    public void setTimeOrders(LocalTime timeOrders) {
        this.timeOrders = timeOrders;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
