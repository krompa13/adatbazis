package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RendszergazdaRepository
        extends MongoRepository<Rendszergazda, String> {
    static Optional<Rendszergazda> deleteRendszergazdaByRend_ID(Integer Id) {
        return null;
    }

    Optional<Rendszergazda> findRendszergazdaByRend_ID(Integer Id);

}


