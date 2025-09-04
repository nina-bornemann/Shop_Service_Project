package com.ninabornemann;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {

    List<Order> ordersList = new ArrayList<>();

    public OrderListRepo() {

    }

    public OrderListRepo(List<Order> abc) {
    this.ordersList = abc;
    }

    public void addToOrders(Order order) {
        ordersList.add(order);
    }

    public void removeFromOrders(Order order) {
        ordersList.remove(order);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "ordersList=" + ordersList +
                '}';
    }

    public String getOrderInfo(Order order) {
        String info = "Product ordered= " + order.product() + ", amount ordered= " + order.amountToOrder();
        return info;
    }

    public String getAllOrderInfo(List<Order> ordersList) {
        String info = "";
        for (Order o : ordersList) {
            info += getOrderInfo(o);
        }
        return info;
    }
}
