package com.ninabornemann;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {

    List<Order> ordersList = new ArrayList<>();

    public OrderListRepo() {}

    public OrderListRepo(List<Order> abc) {
        this.ordersList = abc;
    }

    @Override
    public boolean contains(String orderID) {
        for (Order o : ordersList) {
            if (o.orderId() == orderID) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void addToOrders(Order order) {
        ordersList.add(order);
    }

    @Override
    public void removeFromOrders(Order order) {
        ordersList.remove(order);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" + "ordersList=" + ordersList + '}';
    }

    @Override
    public String getOrderInfo(Order order) {
        String info = "OrderId=" + order.orderId() + ", " + order.product() + ", amount ordered= " + order.amountToOrder();
        return info;
    }

    @Override
    public String getAllOrderInfo() {
        String info = "";
        for (Order o : ordersList) {
            info += getOrderInfo(o) + "\n";
        }
        return info;
    }
}
