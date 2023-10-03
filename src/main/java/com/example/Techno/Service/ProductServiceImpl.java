package com.example.Techno.Service;

import com.example.Techno.Entity.Product;
import com.example.Techno.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        System.out.println("-------------In-1");
        return productRepository.findAll();

    }

    public Boolean addProduct(Product a) {
        System.out.println("-------------In-2");
        productRepository.save(a);
        return true;
    }


}
