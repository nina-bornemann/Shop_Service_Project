package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    ProductRepo products = new ProductRepo(new ArrayList<>());

    @Test
    void productIsPrinted() {
        Product p1 = new Product("Blanket", 14.5, true);
        String expected = "Product[name=Blanket, price=14.5, availability=true]";
        String actual = p1.toString();
        assertEquals(expected, actual);
    }

    @Test
    void productIsNotPrintedCorrectly() {
        Product p1 = new Product("Blanket", 14.5, true);
        String expected = "Product[name=Blanket, price=14.55, availability=true]";
        String actual = p1.toString();
        assertNotEquals(expected, actual);
    }

    @Test
    void productName_isCorrect() {
        Product p1 = new Product("Blanket", 14.5, true);
        String expected = "Blanket";
        String actual = p1.name();
        assertEquals(expected, actual);
    }

    @Test
    void productName_isNotCorrect() {
        Product p1 = new Product("Blanket", 14.5, true);
        String expected = "Pillow";
        String actual = p1.name();
        assertNotEquals(expected, actual);
    }

    @Test
    void productPrice_isCorrect() {
        Product p1 = new Product("Blanket", 14.5, true);
        assertEquals(14.5, p1.price());
    }

    @Test
    void productPrice_isNotCorrect() {
        Product p1 = new Product("Blanket", 14.5, true);
        assertNotEquals(15.5, p1.price());
    }

}