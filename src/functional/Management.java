package functional;

import orders.Order;

public interface Management {
    void addOrder(Order order);

    void removeOrder(Order order);

    void searchOrder(int namOfOrder);
}
