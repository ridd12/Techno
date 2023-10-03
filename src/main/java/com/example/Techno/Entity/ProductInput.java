package com.example.Techno.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInput {


    String name;
    String minQuantity;
    String price;
    String quantityAvailable;


}
