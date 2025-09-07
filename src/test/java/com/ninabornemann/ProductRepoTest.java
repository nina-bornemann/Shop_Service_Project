package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void addProduct_contains() {
        List<Product> list = new ArrayList<>();
        Product pillow = new Product("3","Pillow", 5.95, 4);
        list.add(pillow);
        assertTrue(list.contains(pillow));
    }

    @Test
    void addProduct_containsNot() {
        List<Product> list = new ArrayList<>();
        Product pillow = new Product("3","Pillow", 5.95, 2);
        Product blanket = new Product("4","Blanket", 15.20, 4);
        list.add(pillow);
        assertFalse(list.contains(blanket));
    }

    @Test
    void removeProduct_Correct() {
        List<Product> list = new ArrayList<>();
        Product pillow = new Product("3","Pillow", 5.95, 3);
        list.add(pillow);
        list.remove(pillow);
        assertFalse(list.contains(pillow));
    }

    @Test
    void removeProduct_NotCorrect() {
        List<Product> list = new ArrayList<>();
        Product pillow = new Product("3","Pillow", 5.95, 3);
        Product blanket = new Product("4","Blanket", 15.20, 4);
        list.add(pillow);
        list.add(blanket);
        list.remove(pillow);
        assertTrue(list.contains(blanket));
    }


    @Test
    void getProductInfo_isEqual() {
        ProductRepo products = new ProductRepo(new ArrayList<>());
        Product pillow = new Product("3","Pillow", 5.99, 2);
        String expected = "Name of the product: Pillow, Price: 5.99€, available: 2";
        String actual = products.getProductInfo(pillow);
        assertEquals(expected, actual);
    }

    @Test
    void getProductInfo_isNotEqual() {
        ProductRepo products = new ProductRepo(new ArrayList<>());
        Product pillow = new Product("3","Pillow", 5.99, 3);
        String expected = "Name of the product: Blanket, Price: 5.99€, available: 3";
        String actual = products.getProductInfo(pillow);
        assertNotEquals(expected, actual);
    }

    @Test
    void getAllProductInfo_isEqual() {
        List<Product> list = new ArrayList<>();
        Product pillow = new Product("3","Pillow", 5.99, 2);
        Product blanket = new Product("4","Blanket", 15.75, 7);
        list.add(pillow);
        list.add(blanket);
        ProductRepo repo = new ProductRepo(list);
        String expected = "Name of the product: Pillow, Price: 5.99€, available: 2" +
                "Name of the product: Blanket, Price: 15.75€, available: 7";
        String actual = repo.getAllProductInfo();
        assertEquals(expected, actual);
    }

    @Test
    void getAllProductInfo_isNotEqual() {
        List<Product> list = new ArrayList<>();
        Product pillow = new Product("3","Pillow", 5.99, 5);
        Product blanket = new Product("4","Blanket", 15.75, 7);
        list.add(pillow);
        list.add(blanket);
        ProductRepo repo = new ProductRepo(list);
        String expected = "Name of the product: Blanket, Price: 5.99€, available: 5" +
                "Name of the product: Pillow, Price: 15.75€, available: 7";
        String actual = repo.getAllProductInfo();
        assertNotEquals(expected, actual);
    }
}