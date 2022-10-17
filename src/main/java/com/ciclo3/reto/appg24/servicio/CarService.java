package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Car;
import com.ciclo3.reto.appg24.repositorio.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarService{
    @Autowired
    private CarRepository repository;
    public List<Car> getCars(){
        return repository.findAll();
    }
    public Car saveCar(Car car){
        return repository.save(car);
    }
}

/**
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll(){
        return carRepository.getAll();
    }
    public Optional<Car> getCar(Integer idCar){
        return carRepository.getCar(idCar);
    }
    public Car save(Car p){
        if(p.getIdCar()==null){
            return carRepository.save(p);
        }else{
            Optional<Car> e = carRepository.getCar(p.getIdCar());
            if(e.isPresent()){
                return p;
            }else{
                return carRepository.save(p);
            }
        }
    }
    public Car update(Car p){
        if(p.getIdCar()!=null){
            Optional<Car> q = carRepository.getCar(p.getIdCar());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getBrand()!=null){
                    q.get().setBrand(p.getBrand());
                }
                if(p.getYear()!=null){
                    q.get().setYear(p.getYear());
                }
                if(p.getDescription()!=null){
                    q.get().setDescription(p.getDescription());
                }
                if(p.getGama()!=null){
                    q.get().setGama(p.getGama());
                }
                carRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(Integer idCar){
        boolean flag=false;
        Optional<Car>p= carRepository.getCar(idCar);
        if(p.isPresent()){
            carRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}*/