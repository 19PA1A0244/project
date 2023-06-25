package com.cs5500.NEUeat.repository;

import com.cs5500.NEUeat.model.SearchEngine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchEngineRepository extends MongoRepository<SearchEngine, String> {

}
