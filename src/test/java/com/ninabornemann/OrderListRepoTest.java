package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test
    void printOrderInfo_isEqual() {
        OrderListRepo orderRepo = new OrderListRepo(new ArrayList<>());
        Order order1 = new Order("1", new Product("Table", 54.95, true), 2);
        String expected = "OrderId=1, Product[name=Table, price=54.95, availability=true], amount ordered= 2";
        String actual = orderRepo.getOrderInfo(order1);
        assertEquals(expected, actual);
    }

    @Test
    void printAllOrderInfo_isEqual() {
        List<Order> list = new ArrayList<>();
        Order order1 = new Order("1", new Product("Table", 54.95, true), 2);
        Order order2 = new Order("2", new Product("Blanket", 22.99, true), 4);
        list.add(order1);
        list.add(order2);
        OrderListRepo orderRepo = new OrderListRepo(list);
        String expected = "OrderId=1, Product[name=Table, price=54.95, availability=true], amount ordered= 2\n" +
                "OrderId=2, Product[name=Blanket, price=22.99, availability=true], amount ordered= 4\n";
        String actual = orderRepo.getAllOrderInfo();
        assertEquals(expected, actual);
    }



}