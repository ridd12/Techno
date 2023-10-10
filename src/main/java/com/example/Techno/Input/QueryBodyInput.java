package com.example.Techno.Input;


import lombok.Builder;
import lombok.Data;
import lombok.experimental.StandardException;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
public class QueryBodyInput {
    private String email;
    private String query;
}
