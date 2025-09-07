package com.ninabornemann;

import java.util.Map;

public record Order(String orderId, Map<Product, Integer> products) {

}
