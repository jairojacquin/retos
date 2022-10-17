package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Reservation;
import com.ciclo3.reto.appg24.servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")

public class ApiReservation {
    @Autowired
    private ReservationService service;

    @GetMapping("/all")
    public List<Reservation> findAllReservation(){ return service.getReservation();
    }
    @PostMapping("/save")
    public ResponseEntity saveReservation(@RequestBody Reservation reservation){
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    }
}
