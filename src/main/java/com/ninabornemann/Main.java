package com.ninabornemann;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ShopService shop = new ShopService(new OrderListRepo());

        Product pillow = new Product("123", "Pillow", 5.99, 10);
        Product blanket = new Product("234", "Blanket", 20.55, 6);
        Product table = new Product("345", "Table", 45.95, 3);

        shop.repo.addProduct(pillow);
        shop.repo.addProduct(blanket);
        shop.repo.addProduct(table);

        Order order1 = new Order(UUID.randomUUID().toString(), Map.of(pillow, 2, blanket, 1));

        shop.placeOrder(order1);
        System.out.println(shop.ordersList.getAllOrderInfo());

        Map<String,Integer> newCLIorder = new HashMap<>();

        Scanner myOrder = new Scanner(System.in);
        System.out.println("Welcome to the shop! Please enter your order here. When you are done listing your product Ids please write \u001B[34m'done'\u001B[0m. " +
                "(Follow the format -> product Id : quantity");

        boolean continueOrder = true;
        while (continueOrder) {
            System.out.println("Please enter the product ID/ or write \u001B[34m'done'\u001B[0m to finish the order ");
            String id = myOrder.nextLine();
            if (id.equals("done")) {
                continueOrder = false;
            } else {
                System.out.println("Please enter the quantity");
                int quantity = myOrder.nextInt();
                myOrder.nextLine();
                newCLIorder.put(id, quantity);
            }
        }






        shop.placeOrderByCLI(newCLIorder);

    }
}