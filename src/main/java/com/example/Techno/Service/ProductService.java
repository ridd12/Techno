package com.example.Techno.Service;

import com.example.Techno.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Boolean addProduct(Product a);
}

