package com.ciclo3.reto.appg24.repositorio;

import com.ciclo3.reto.appg24.entidad.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
/**
@Repository

public class CarRepository {
    @Autowired
    private CarCrudRepository carCrudRepository;

    public List<Car> getAll(){
        return (List<Car>) carCrudRepository.findAll();
    }

    public Optional<Car> getCar(Integer idCar){
        return carCrudRepository.findById(idCar);
    }
    public Car save(Car c){
        return carCrudRepository.save(c);
    }
    public void delete(Car c){
        carCrudRepository.delete(c);
    }
}*/
