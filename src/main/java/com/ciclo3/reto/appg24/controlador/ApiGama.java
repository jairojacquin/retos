package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Gama;
import com.ciclo3.reto.appg24.servicio.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama/")
@CrossOrigin(origins = "*")
public class ApiGama {
    /**
     * instancia de servicio categoria operaciones crud
     */
    @Autowired
    private GamaService service;

    @GetMapping("/all")
    public List<Gama> findAllGama() {
        return service.getGamas();
    }
    @PostMapping("/save")
    public ResponseEntity saveGama(@RequestBody Gama gama) {
        service.saveGama(gama);
        return ResponseEntity.status(201).build();
    }
    @GetMapping("/{id}")
    public Gama getGama(@PathVariable int id){
        return service.getGama(id);
    }
    @PutMapping("/update")
    public ResponseEntity editGama(@RequestBody Gama gama){
        service.updateGama(gama);
        return ResponseEntity.status(201).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteGama(@PathVariable int id){
        service.deleteGama(id);
        return ResponseEntity.status(204).build();
    }

}