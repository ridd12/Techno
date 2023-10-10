package com.example.Techno.Repository;

import com.example.Techno.Input.Query;
import com.example.Techno.Input.QueryBodyInput;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends MongoRepository<Query,String> {

}
