package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Gama;
import com.ciclo3.reto.appg24.repositorio.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    private GamaRepository repository;

    public List<Gama> getGamas() {
        return repository.findAll();
    }
    public Gama saveGama(Gama gama){
        return repository.save(gama);
    }
    public Gama getGama(int id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteGama(int id){
        repository.deleteById(id);
    }

    public Gama updateGama(Gama gamaUpd){
        Gama gamaOld = getGama(gamaUpd.getIdGama());
        gamaOld.setName(gamaUpd.getName());
        gamaOld.setDescription(gamaUpd.getDescription());
        return repository.save(gamaOld);

    }

}
/**
public class GamaService {
    @Autowired
    private GamaRepository gamaRepository;

    public List<Gama> getAll(){
        return gamaRepository.getAll();
    }
    public Optional<Gama> getProduct(int idGama){
        return gamaRepository.getGama(idGama);
    }

    public Gama save(Gama p){
        if(p.getIdGama()==null){
            return gamaRepository.save(p);
        }else{
            Optional<Gama> e = gamaRepository.getGama(p.getIdGama());
            if(e.isPresent()){
                return p;
            }else{
                return gamaRepository.save(p);
            }
        }
    }
    public Gama update(Gama p){
        if(p.getIdGama()!=null){
            Optional<Gama> q = gamaRepository.getGama(p.getIdGama());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                gamaRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int idGama){
        boolean flag=false;
        Optional<Gama>p= gamaRepository.getGama(idGama);
        if(p.isPresent()){
            gamaRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }
}*/
