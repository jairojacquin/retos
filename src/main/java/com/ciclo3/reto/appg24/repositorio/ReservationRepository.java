package com.ciclo3.reto.appg24.repositorio;

import com.ciclo3.reto.appg24.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
/**
@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    public List<Reservation> getAll(){

        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int idReservation){
        return reservationCrudRepository.findById(idReservation);
    }
    public Reservation save(Reservation p){

        return reservationCrudRepository.save(p);
    }
    public void delete(Reservation p){

        reservationCrudRepository.delete(p);
    }
}
*/