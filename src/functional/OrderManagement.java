package functional;

import orders.Order;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class OrderManagement implements Management {
    private ArrayList<Order> orders;

    public OrderManagement() {
    }

    public OrderManagement(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void addOrder(Order orderOfProduct) {
        orders.add(orderOfProduct);
    }

    @Override
    public void removeOrder(Order orderOfProduct) {

         if (orders.remove(orderOfProduct)){
                System.out.println("Заказ удален!!!");
         }else {
             System.out.println("Токого заказа и так нет.");
         }


    }

    @Override
    public void searchOrder(int namOfOrder) {
        boolean check = true;
        for (Order order : orders) {
            if (order.getNumberOfOrder() == namOfOrder) {
                System.out.println(order);
                check = false;
            }
        }
        if (check) {
            System.out.println("Такого заказа нету.");
        }

    }


    @Override
    public String toString() {
        return "OrderManagement{" +
                "orders=" + orders +
                '}';
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
