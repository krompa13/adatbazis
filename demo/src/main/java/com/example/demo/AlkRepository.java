package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlkRepository extends MongoRepository<Alkuzemelteto, String> {
}
