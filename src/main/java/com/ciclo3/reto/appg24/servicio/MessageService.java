package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Message;
import com.ciclo3.reto.appg24.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public List<Message> getMessages(){
        return repository.findAll();
    }

    /**
     * @param message
     * @return
     */
    public Message saveMessage(Message message){
        return repository.save(message);
    }
}