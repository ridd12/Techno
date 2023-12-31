package com.example.Techno.Input;


import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection = "Query")
public class Query {
    @Id
    private String id;
    private String email;
    private String query;
}
