package com.ninabornemann;

import java.util.*;

public class ShopService {

    ShopService() {
    }

    ShopService(OrderRepo o) {
        ordersList = o;
    }

    ProductRepo repo = new ProductRepo(new ArrayList<>());
    OrderRepo ordersList = new OrderMapRepo();

    public  void placeOrderByCLI(Map<String, Integer> productIDSToOrder) {
        Map<Product, Integer> products = new HashMap<>();
        for (Map.Entry<String, Integer> entry : productIDSToOrder.entrySet()) {
            Optional<Product> product = repo.getProductById(entry.getKey());
            products.put(product.get(), entry.getValue());
        }
        Order order = new Order(UUID.randomUUID().toString(), products);
        placeOrder(order);
    }

    public void placeOrder(Order order) {
        boolean productsAvailable = true;
        for (Map.Entry<Product, Integer> entry : order.products().entrySet()) {
            Product p = entry.getKey();
            Integer amountToOrder = entry.getValue();
            if (!repo.hasProduct(p.id(), amountToOrder)) {
                productsAvailable = false;
                System.out.println("The product" + p.name() + "is not available. Order not successful.");
            }
        }
        if (productsAvailable) {
            ordersList.addToOrders(order);
            System.out.println("The product is available. Order successful.");
        }
    }
}
