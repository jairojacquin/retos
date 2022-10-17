package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Score;
import com.ciclo3.reto.appg24.repositorio.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    public List<Score> getScore(){
        return repository.findAll();
    }

    /**
     * @param score
     * @return
     */
    public Score saveScore(Score score){

        return repository.save(score);
    }
}

