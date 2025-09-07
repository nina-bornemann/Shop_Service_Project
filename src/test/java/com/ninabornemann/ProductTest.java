package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    ProductRepo products = new ProductRepo(new ArrayList<>());

    @Test
    void productIsPrinted() {
        Product p1 = new Product("2", "Blanket", 14.5, 5);
        String expected = "Product[id=2, name=Blanket, price=14.5, availability=5]";
        String actual = p1.toString();
        assertEquals(expected, actual);
    }

    @Test
    void productIsNotPrintedCorrectly() {
        Product p1 = new Product("5", "Blanket", 14.5, 2);
        String expected = "Product[id= 5, name=Blanket, price=14.55, availability=2]";
        String actual = p1.toString();
        assertNotEquals(expected, actual);
    }

    @Test
    void productName_isCorrect() {
        Product p1 = new Product("3", "Blanket", 14.5, 3);
        String expected = "Blanket";
        String actual = p1.name();
        assertEquals(expected, actual);
    }

    @Test
    void productName_isNotCorrect() {
        Product p1 = new Product("3","Blanket", 14.5, 2);
        String expected = "Pillow";
        String actual = p1.name();
        assertNotEquals(expected, actual);
    }

    @Test
    void productPrice_isCorrect() {
        Product p1 = new Product("3","Blanket", 14.5, 5);
        assertEquals(14.5, p1.price());
    }

    @Test
    void productPrice_isNotCorrect() {
        Product p1 = new Product("3","Blanket", 14.5, 2);
        assertNotEquals(15.5, p1.price());
    }

}