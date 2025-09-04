package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test
    void printOrderInfo_isEqual() {
        OrderListRepo orderRepo = new OrderListRepo(new ArrayList<>());
        Order order1 = new Order(new Product("Table", 54.95, true), 2);
        String expected = "Product ordered= Product[name=Table, price=54.95, availability=true], amount ordered= 2";
        String actual = orderRepo.getOrderInfo(order1);
        assertEquals(expected, actual);
    }

    @Test
    void printAllOrderInfo_isEqual() {
        OrderListRepo orderRepo = new OrderListRepo(new ArrayList<>());
        List<Order> list = new ArrayList<>();
        Order order1 = new Order(new Product("Table", 54.95, true), 2);
        Order order2 = new Order(new Product("Blanket", 22.99, true), 4);
        list.add(order1);
        list.add(order2);
        String expected = "Product ordered= Product[name=Table, price=54.95, availability=true], amount ordered= 2" +
                "Product ordered= Product[name=Blanket, price=22.99, availability=true], amount ordered= 4";
        String actual = orderRepo.getAllOrderInfo(list);
        assertEquals(expected, actual);
    }



}