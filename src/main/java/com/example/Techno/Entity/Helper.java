package com.example.Techno.Entity;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public List<String> products;

    public Helper() {
        products = new ArrayList<>();
    }

    public List<String> getProducts() {
        return products;
    }

    public void addProducts(String products) {
        this.products.add(products);
    }
}
