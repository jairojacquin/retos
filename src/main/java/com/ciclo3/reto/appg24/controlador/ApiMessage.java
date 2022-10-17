package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Message;
import com.ciclo3.reto.appg24.servicio.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")
public class ApiMessage {
    @Autowired
    private MessageService service;

    @GetMapping("/all")
    public List<Message> findAllMessage(){

        return service.getMessages();
    }
    @PostMapping("/save")
    public ResponseEntity saveMessage(@RequestBody Message message){
        service.saveMessage(message);
        return ResponseEntity.status(201).build();
    }
}
