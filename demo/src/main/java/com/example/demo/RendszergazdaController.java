package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/map")
@AllArgsConstructor
public class RendszergazdaController {
    private final RendszergazdaService rendszergazdaService;
    @GetMapping
    public List<Rendszergazda> getRendszergazda() {
        return RendszergazdaService.getAll();
    }

    @PostMapping("post")
    public ResponseEntity<String> addRendszergazda(@RequestBody Rendszergazda rendszergazda) {
        return rendszergazdaService.addRendszergazda(rendszergazda);
    }

    @PutMapping("put")
    public ResponseEntity<String> updateRendszergazda(@RequestBody Rendszergazda rendszergazda) {
        return rendszergazdaService.updateRendszergazda(rendszergazda);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteRendszergazda(@PathVariable("Rend_ID") Integer Id) {
        return rendszergazdaService.deleteRendszergazdaByRend_ID(Id);
    }
}
