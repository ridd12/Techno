package com.example.Techno.Controller;

import com.example.Techno.Entity.Product;
import com.example.Techno.Entity.ProductInput;
import com.example.Techno.Service.ProductService;
import com.example.Techno.Service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.Techno.Input.QueryBodyInput;


import java.util.List;


@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RestController {

    @Autowired
    ProductService productService;

    @Autowired
    QueryService queryService;

    @GetMapping
    public List<Product> product() {
        return productService.getAll();
    }

    @PostMapping
    public boolean addProduct(@RequestBody ProductInput a) {
        return productService.addProduct(Product
                .builder()
                .price(a.getPrice())
                .name(a.getName())
                .minQuantity(a.getMinQuantity())
                .quantityAvailable(a.getQuantityAvailable())
                .build());
    }

    @PostMapping("/query")
    public boolean addquery(@RequestBody QueryBodyInput queryBodyInput){
        queryService.addquery(queryBodyInput);
        return true;
    }


}


//
//    @GetMapping
//    public String abc(){
//        return "Aaa";
//    }
//
//    @GetMapping
//    public String abc(){
//        return "Aaa";
//    }
