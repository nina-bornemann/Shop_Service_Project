package com.ninabornemann;

import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<String, Order> orderMapRepo = new HashMap<>();

    @Override
    public void addToOrders(Order order) {
        orderMapRepo.put(order.orderId(), order);
    }

    @Override
    public boolean contains(String orderID) {
        return orderMapRepo.containsKey(orderID);
    }

    @Override
    public void removeFromOrders(Order order) {
        orderMapRepo.remove(order.orderId(), order);
    }

    @Override
    public String getOrderInfo(Order order) {
        return "OrderMapRepo{" + "orders=" + orderMapRepo + "}";
    }

    @Override
    public String getAllOrderInfo() {
        String info = "";
        for (Map.Entry<String, Order> entry : orderMapRepo.entrySet()) {
            info += getOrderInfo(entry.getValue());
        }
        return info;
    }
}
