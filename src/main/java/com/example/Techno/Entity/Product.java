package com.example.Techno.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {

    @org.springframework.data.annotation.Id
    String Id;

    String name;
    String minQuantity;
    String price;
    String quantityAvailable;


}
