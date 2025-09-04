package com.ninabornemann;

public interface OrderRepo {

    public void addToOrders(Order order);
    public void removeFromOrders(Order order);
    public String getOrderInfo(Order order);
    public String getAllOrderInfo();
    public boolean contains(String orderID);
}
