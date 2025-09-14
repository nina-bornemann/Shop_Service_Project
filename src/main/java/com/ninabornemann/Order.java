package com.ninabornemann;

import java.util.Map;

/*
new Order("1234", {"apple": 3, "blanket": 6})
 */
public record Order(String orderId, Map<Product, Integer> products) {

    public double sumPriceOfOrders() {
        double sum = 0;
        for (Map.Entry<Product, Integer> o : products.entrySet()) {
            sum += o.getKey().price() * o.getValue();
        }
        return sum;
    }

}
