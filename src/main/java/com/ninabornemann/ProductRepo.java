package com.ninabornemann;

import java.util.*;

public class ProductRepo {

    List<Product> products = new ArrayList<>();

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public String getProductInfo(Product product) {
        String info = "Name of the product: " + product.name()
                + ", Price: " + product.price()
                + "€, available: " + product.availability();
        return info;
    }

    public String getAllProductInfo() {
        String allInfo = "";
        for (Product p : products) {
            allInfo += getProductInfo(p);
        }
        return allInfo;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    public boolean hasProduct(String productId, int amountToOrder) {
        for (Product p : products) {
            if (p.id().equals(productId)) {
                return p.availability() >= amountToOrder;
            }
        }
        return false;
    }

    public Optional<Product> getProductById(String key) {
        for (Product p : products) {
            if (p.id().equals(key)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
