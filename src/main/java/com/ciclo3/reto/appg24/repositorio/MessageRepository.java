package com.ciclo3.reto.appg24.repositorio;

import com.ciclo3.reto.appg24.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer>{
}