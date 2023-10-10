package com.example.Techno.Service;

import com.example.Techno.Input.Query;
import com.example.Techno.Input.QueryBodyInput;
import com.example.Techno.Repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QueryServiceImpl implements QueryService{

    @Autowired
    QueryRepository queryRepository;

    @Override
    public Query addquery(QueryBodyInput queryBodyInput) {
        return queryRepository.save(Query.builder().query(queryBodyInput.getQuery()).email(queryBodyInput.getEmail()).build());
    }
}
