package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RendszergazdaService {
    private final RendszergazdaRepository rendszergazdaRepository;
    public static List<Rendszergazda> getAll() {
        return RendszergazdaRepository.findAll();
    }

    public static ResponseEntity<String> addRendszergazda(Rendszergazda rendszergazda) {
        RendszergazdaRepository.insert(rendszergazda);
        return new ResponseEntity<>(
                "Added map object id: "+ rendszergazda.getRend_ID() + ", successfully ADDED!",
                HttpStatus.OK
        );    }

    public ResponseEntity<String> updateRendszergazda(Rendszergazda rendszergazda) {
        Optional<Rendszergazda> foundRendszergazda = rendszergazdaRepository.findRendszergazdaByRend_ID(rendszergazda.getRend_ID());
        if(!foundRendszergazda.isPresent()){
            return new ResponseEntity<>(
                    "Id: " + rendszergazda.getRend_ID() + " NOT FOUND",
                    HttpStatus.BAD_REQUEST
            );
        }
        foundRendszergazda.ifPresent(s -> {
            s.setName(rendszergazda.getName());
            s.setHiba(rendszergazda.getHiba());
            s.setBirthday(rendszergazda.getBirthday());

            RendszergazdaRepository.save(s);
        });
        return new ResponseEntity<>(
                "Selected map object id: " + rendszergazda.getRend_ID() + ", successfully UPDATED!",
                HttpStatus.OK
        );
    }

    public ResponseEntity<String> deleteRendszergazdaByRend_ID(Integer Id) {
        Optional<Rendszergazda> foundRendszergazda = rendszergazdaRepository.findRendszergazdaByRend_ID(Id);
        if(!foundRendszergazda.isPresent()){
            return new ResponseEntity<>(
                    "Id: " + Id + " NOT FOUND",
                    HttpStatus.BAD_REQUEST
            );
        }
        RendszergazdaRepository.deleteRendszergazdaByRend_ID(Id);
        return new ResponseEntity<>(
                "Selected map object id: "+ Id + ", successfully DELETED!",
                HttpStatus.OK
        );
    }
}