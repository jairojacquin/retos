package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Car;
import com.ciclo3.reto.appg24.servicio.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**com.ciclo3.reto.appg24*/
import java.util.List;

@RestController
@RequestMapping("/api/Car/")
@CrossOrigin(origins = "*")
public class ApiCar {
    @Autowired
    private CarService service;

    @GetMapping("/all")
    public List<Car> findAllCars() {
        return service.getCars();
    }

    @PostMapping("/save")

    public ResponseEntity saveCar(@RequestBody Car car) {
        service.saveCar(car);
        return ResponseEntity.status(201).build();
    }
}

