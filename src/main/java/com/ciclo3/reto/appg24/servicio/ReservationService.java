package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Reservation;
import com.ciclo3.reto.appg24.repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    public List<Reservation> getReservation(){

        return repository.findAll();
    }
    public Reservation saveReservation(Reservation reservation){

        return repository.save(reservation);
    }
}
/**
public class ReservationService {
    @Autowired

    private ReservationRepository reservationRepository;

    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }
    public Optional<Reservation> getProduct(int idReservation){
        return reservationRepository.getReservation(idReservation);
    }
    public Reservation save(Reservation p){
        if(p.getIdReservation()==null){
            return reservationRepository.save(p);
        }else{
            Optional<Reservation> e = reservationRepository.getReservation(p.getIdReservation());
            if(e.isPresent()){
                return p;
            }else{
                return reservationRepository.save(p);
            }
        }
    }
    public Reservation update(Reservation p){
        if(p.getIdReservation()!=null){
            Optional<Reservation> q = reservationRepository.getReservation(p.getIdReservation());
            if(q.isPresent()){
                if(p.getIdReservation()!=null){
                    q.get().setIdReservation(p.getIdReservation());
                }
                if(p.getCliente()!=null){
                    q.get().setCliente(p.getCliente());
                }
                if(p.getFechainicio()!=null){
                    q.get().setFechainicio(p.getFechainicio());
                }
                if(p.getFechafin()!=null){
                    q.get().setFechafin(p.getFechafin());
                }
                reservationRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int idReservation){
        boolean flag=false;
        Optional<Reservation>p=reservationRepository.getReservation(idReservation);
        if(p.isPresent()){
            reservationRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}*/
