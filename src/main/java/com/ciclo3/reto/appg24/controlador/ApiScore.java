package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Score;
import com.ciclo3.reto.appg24.servicio.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*")

public class ApiScore {
    @Autowired
    private ScoreService service;

    @GetMapping("/all")
    public List<Score> findAllScore(){
       return service.getScore();
    }

    @PostMapping("/save")
    public ResponseEntity saveCar(@RequestBody Score score){
        service.saveScore(score);
        return ResponseEntity.status(201).build();
    }
}
